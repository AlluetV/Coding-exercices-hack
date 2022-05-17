package com.alluet.hackerrank.algorithms.easy2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DrawingBookMin {

    public static int pageCount(int n, int p) {
        // Write your code here
        int front = p/2;
        int back = n%2 == 0 ? (n-p+1)/2 : (n-p)/2;
        return  Math.min(front, back);
    }

    @Test
    public void sample0(){
        Assertions.assertEquals(1, pageCount(6, 2));
    }

    @Test
    public void sample1(){
        Assertions.assertEquals(0, pageCount(5, 4));
    }

    @Test
    public void sample2(){
        Assertions.assertEquals(2, pageCount(12, 5));
    }

    @Test
    public void sample3(){
        Assertions.assertEquals(1, pageCount(6, 5));
    }

    @Test
    public void sample4(){
        Assertions.assertEquals(1, pageCount(7, 3));
    }

    @Test
    public void sample5(){
        Assertions.assertEquals(15, pageCount(100, 30));
    }

    @Test
    public void sample6(){
        Assertions.assertEquals(25, pageCount(100, 50));
    }

    @Test
    public void sample7(){
        Assertions.assertEquals(25, pageCount(100, 51));
    }

    @Test
    public void sample8(){
        Assertions.assertEquals(24, pageCount(100, 52));
    }
}
