package com.alluet.hackerrank.algorithms.easy2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DayOfTheProgrammer2 {
    public static String dayOfProgrammer(int year) {
        // Write your code here
        int leapY = 244;
        int notLeapY = 243;
        int programmerDay = 256;

        if((year>=1700 && year<=1917) && year%4==0){
            int day = programmerDay - leapY;
            return (day + ".09." + year);
        } else if(year == 1918){
            int day = 2 * (programmerDay - notLeapY);
            return (day + ".09." + year);
        } else if(year%400==0) {
            int day = programmerDay - leapY;
            return (day + ".09." + year);
        } else if((year%4==0 && year%100!=0)){
            int day = programmerDay - leapY;
            return (day + ".09." + year);
        } else {
            int day = programmerDay - notLeapY;
            return (day + ".09." + year);
        }
    }

    @Test
    public void currentDay(){
        String day = dayOfProgrammer(2017);
        Assertions.assertEquals("13.09.2017", day);
    }

    @Test
    public void currentDay2(){
        String dayTwo = dayOfProgrammer(2016);
        Assertions.assertEquals("12.09.2016", dayTwo);
    }

    @Test
    public void currentDay3(){
        String dayThree = dayOfProgrammer(1800);
        Assertions.assertEquals("12.09.1800", dayThree);
    }
}
