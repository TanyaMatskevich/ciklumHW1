package com.ciklum.matskevich.java_SE.lecture41;

public class MessageProcesor implements Runnable{

    private int message;

    public MessageProcesor(int message) {
        this.message = message;
    }

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + "[RECEIVED] Message = " + message);
        respondToMessage();
        System.out.println(Thread.currentThread().getName() + "(DONE) Message = " + message);
    }

    private void respondToMessage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Unable to process message " + message);
        }
    }
}
