package com.ciklum.matskevich.java_SE.lecture40;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    BlockingQueue<Integer> questionQueue;
    private int questionNo;

    public Producer(BlockingQueue<Integer> questionQueue) {
        this.questionQueue = questionQueue;
    }

    @Override
    public void run() {

        while (true) {
            try {
                synchronized (this) {
                    int nextQuestion = questionNo++;
                    System.out.println("Got new question: " + nextQuestion);
                    questionQueue.put(nextQuestion);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
