package com.alluet.hackerrank.algorithms.easy2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DayOfTheProgrammer {
    public static String dayOfProgrammer(int year) {
        // Write your code here
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        // for all cases after 1918 as I am starting from 1st day of year
        int daysToAdjust = 255;

        if (year == 1918) {
            // this is the year they turned to gregorian calendar
            daysToAdjust = daysToAdjust + 13;
        }

        else if (year < 1918) {
            // jullian calendar only divide by 4 for leap year, where  gregorian excludes divide by 100 case
            if (year % 4 == 0 && year % 100 == 0) {
                daysToAdjust = daysToAdjust - 1;
            }
        }

        LocalDate date = LocalDate.of(year, 1, 1);
        LocalDate dayOfProgrammer = date.plusDays(daysToAdjust);

        return dayOfProgrammer.format(formatter);

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
