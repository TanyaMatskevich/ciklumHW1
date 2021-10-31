package com.ciklum.matskevich.java_SE.lecture50;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) throws IOException {

//        IntStream
//                .range(1, 10)
//                .forEach((x) -> System.out.print(x));
//        System.out.println();
//
//        IntStream
//                .range(1, 10)
//                .skip(5)
//                .forEach((x) -> System.out.print(x));
//        System.out.println();
//
//        int val = IntStream
//                .range(1, 5)
//                .sum();
//        System.out.println(val);

//        Stream.of("Hello", "bottle", "Africa")
//                .sorted()
//                .findFirst()
//                .ifPresent((x) -> System.out.println(x));

//        String[] items = {"car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy"};
//        Stream.of(items)
//                .filter((x) -> x.startsWith("t"))
//                .sorted()
//                .forEach((x) -> System.out.print(x + ", "));
//        System.out.println();

//        Arrays.stream(new int[]{2, 4, 6, 8, 10})
//                .map((x) -> x * x)
//                .average()
//                .ifPresent(n -> System.out.print(n));
//        System.out.println();

//        List<String> listOfItems = Arrays.asList("Computer", "Toothpaste", "Box", "Pencil", "Car", "Tent");
//        listOfItems.stream()
//                .map(x -> x.toLowerCase())
//                .filter(x -> x.startsWith("c"))
//                .sorted()
//                .forEach((x) -> System.out.print(x + ", "));

//        Stream<String> lines = Files.lines(Paths.get("src/com/ciklum/matskevich/java_SE/lecture50/files/wordFile.txt"));
//        lines.sorted()
//                .filter(l -> l.length() > 6)
//                .forEach((x) -> System.out.print(x + ", "));
//        lines.close();

//        List<String> words = Files.lines(Paths.get("src/com/ciklum/matskevich/java_SE/lecture50/files/wordFile.txt"))
//                .filter(x -> x.contains("th"))
//                .collect(Collectors.toList());
//               words.forEach((x) -> System.out.print(x + ", "));
//        System.out.println();

//        Stream<String> rows = Files.lines(Paths.get("src/com/ciklum/matskevich/java_SE/lecture50/files/stockDataCsv.txt"));
//        int rowCount = (int) rows
//                .map(x -> x.split(","))
//                .filter(x -> x.length > 3)
//                .count();
//        System.out.println(rowCount + " good rows.");
//        rows.close();

        Stream<String> rows = Files.lines(Paths.get("src/com/ciklum/matskevich/java_SE/lecture50/files/stockDataCsv.txt"));
        rows
                .map(x -> x.split(","))
                .filter(x -> x.length > 3)
        .filter(x -> Integer.parseInt(x[1].trim()) > 15)
        .forEach(x -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));
        rows.close();
    }
}
