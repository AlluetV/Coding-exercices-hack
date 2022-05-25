package com.alluet.exercices.v1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {

    public static List<Integer> fibonacci(Integer num){
        List<Integer> series = new ArrayList<>();
        int a ;
        int b = 0;
        int c = 1;

        for(int i=0; i<num ; i++){
            a = b;
            b = c;
            c = a + b;

            series.add(a);
        }
        return series;
    }

    @Test
    public void fibonacciTest(){
        List< Integer> output = fibonacci(10);
        Assertions.assertEquals(List.of(0,1,1,2,3,5,8,13,21,34), output);
    }

    @Test
    public void fibonacciTest2(){
        List< Integer> output2 = fibonacci(5);
        Assertions.assertEquals(List.of(0,1,1,2,3), output2);
    }

    @Test
    public void fibonacciTest3(){
        List< Integer> output3 = fibonacci(30);
        Assertions.assertEquals(List.of(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811,514229), output3);
    }
}
