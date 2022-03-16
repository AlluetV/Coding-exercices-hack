package com.alluet.hackerrank.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TimeConversion {

    public static String timeConversion(String s) {
        // Write your code here
        String militaryHour = "";
        int hour = Integer.parseInt(s.substring(0, 2)) % 12;

        if (s.endsWith("PM")){
            hour += 12;
        }
        militaryHour = String.format("%02d", hour) + s.substring(2, 8);

        return militaryHour;
    }

    @Test
    public void hour(){
       String hour1 = timeConversion("07:05:45PM");
       Assertions.assertEquals("19:05:45", hour1);
    }

    @Test
    public void hour2(){
        String hour2 = timeConversion("12:03:54AM");
        Assertions.assertEquals("00:03:54", hour2);
    }

    @Test
    public void hour3(){
        String hour3 = timeConversion("12:28:15PM");
        Assertions.assertEquals("12:28:15", hour3);
    }

    @Test
    public void hour4(){
        String hour4 = timeConversion("05:03:54AM");
        Assertions.assertEquals("05:03:54", hour4);
    }

    @Test
    public void format(){
        System.out.println(String.format("message = %s, %s", "hola", "mundo"));
        System.out.println(String.format("%02d", 0));
        System.out.println(String.format("%02d", 10));
        System.out.println(String.format("%02d", 12));
        System.out.println(String.format("%02d", 100));
    }
}
