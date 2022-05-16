package com.alluet.hackerrank.algorithms.easy2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class BetweenTwoSets {

    //finding the greatest common divisor

    public static int gcd(int n1, int n2){
        if(n2 == 0){
            return n1;
        }
        return gcd(n2 , n1%n2);
    }

    //Lower common multiple
    public static int getLCM(int n1, int n2){
        if(n1 == 0 || n2 == 0){
           return 0;
        }else {
            int gcdNumber = gcd(n1 ,n2);
            return Math.abs(n1 * n2)/gcdNumber;
        }
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int count = 0;

        //LCM of all elements of a
        int lcmA = a.get(0);
        for(Integer integer:a){
            lcmA = getLCM(lcmA, integer);
        }

        //GCD of all elements of b
        int gcdB = b.get(0);
        for(Integer integer: b){
            gcdB = gcd(gcdB ,integer);
        }

        //
        int multiple = 0;
        while(multiple <= gcdB){
            multiple += lcmA;
            if(gcdB % multiple == 0){
                count ++;
            }
        }

        return count;
    }

    @Test
    public void totalIntegers(){
        int numOfInt = getTotalX(List.of(2,4), List.of(16, 32, 96));
        Assertions.assertEquals(3,numOfInt);
    }

    @Test
    public void totalOfIntegers2(){
        int numOfInt2 = getTotalX(List.of(2, 6), List.of(24, 36));
        Assertions.assertEquals(2,numOfInt2);
    }
}
