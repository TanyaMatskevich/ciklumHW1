package com.ciklum.matskevich.java_SE.lecture116;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class UsingDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2030, Month.JANUARY, 10);
        System.out.println(date);
        date = date.plusDays(5).plusMonths(2);
        System.out.println(date);

        LocalTime time = LocalTime.of(10, 30);
        System.out.println(time);
        time = time.plusHours(2).plusMinutes(20);
        System.out.println(time);

        LocalDateTime localDateTime = LocalDateTime.of(date, time);
        System.out.println(localDateTime);
        localDateTime = localDateTime.minusHours(10).plusDays(2).plusWeeks(1);
        System.out.println(localDateTime);

        LocalDate lD= LocalDate.of(2010, Month.APRIL, 1);
        lD.plusDays(10);
        System.out.println(lD);
    }
}

