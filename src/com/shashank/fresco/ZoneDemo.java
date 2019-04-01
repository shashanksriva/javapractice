package com.shashank.fresco;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDemo {
    
    private void calculate() {
        ZoneId zoneId=ZoneId.of("Asia/Singapore");
        ZonedDateTime.of(LocalDateTime.now(),zoneId);
        System.out.println();
    }

    public static void main(String...strings) {
        
    }
}
