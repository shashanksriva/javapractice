package com.shashank.fresco;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeDemo {

    public static void main(String...strings) {
        /*DateTimeFormatter dateFormat=DateTimeFormatter.ISO_DATE;
        LocalDate dateOfBirth= LocalDate.of(2015,Month.FEBRUARY,31);
        System.out.println(dateFormat.format(dateOfBirth));*/
        /*LocalDate date1 = LocalDate.now();
        LocalDate date2 = date1.plus(1, ChronoUnit.MONTHS);
        Period period = Period.between(date2, date1);
        System.out.println("Period: " + period);*/
        
        ZoneId zoneId=ZoneId.of("Asia/Singapore");
        ZonedDateTime.of(LocalDateTime.now(),zoneId);
        System.out.println(ZonedDateTime.now().getOffset());
    }   
}
