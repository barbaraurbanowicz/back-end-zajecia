package com.company;

import java.time.LocalTime;
import java.util.Date;

public class Main5 {public static void main(String[] args) {

    LocalTime localTime = LocalTime.now();
    System.out.println("local date " + localTime);

    Date globalTime = new Date();
    System.out.println("global date " + globalTime);
}
}
