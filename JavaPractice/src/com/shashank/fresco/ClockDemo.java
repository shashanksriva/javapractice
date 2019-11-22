package com.shashank.fresco;

import java.time.Clock;

public class ClockDemo{
  public static void main(String [] args){
    final Clock clock=Clock.systemUTC();
    System.out.println(clock.instant());
    System.out.println(clock.millis());
  }
}
