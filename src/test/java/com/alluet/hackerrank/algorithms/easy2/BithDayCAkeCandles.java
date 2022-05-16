package com.alluet.hackerrank.algorithms.easy2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class BithDayCAkeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int biggest = 0;
        System.out.println(candles);

        Collections.sort(candles);
        System.out.println(candles);

        for (int i = 0; i <candles.size() ; i++) {

            int a = candles.get(candles.size()-1);

            if(candles.get(i) == a){
            biggest += 1;
            }
        }

        return biggest;
    }

    @Test
    public void candle1(){
        int candle1 = birthdayCakeCandles(Arrays.asList(3, 2, 1, 3));
        Assertions.assertEquals(2, candle1 );
    }

    @Test
    public void candle2(){
        int candle2 = birthdayCakeCandles(Arrays.asList(4, 2, 1, 4, 3, 4));
        Assertions.assertEquals(3, candle2);
    }

    @Test
    public void candle3(){
        int candle3 = birthdayCakeCandles(Arrays.asList(3, 1, 2, 1, 2, 3, 3, 1, 3, 2, 3, 3 ,2));
        Assertions.assertEquals(6, candle3);
    }
}
