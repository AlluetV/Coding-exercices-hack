package com.alluet.hackerrank.algorithms.easy2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatsAndMouse {
    public static String catchingMouse(Integer a, Integer b, Integer c){
        String winner;

        if(Math.abs(c - a) > Math.abs(c - b)) {
            return winner = "Cat B";
        }else if(Math.abs(c - a) < Math.abs(c - b)) {
            return winner = "Cat A";
        }else {
            return winner = "Mouse C";
        }

    }

    @Test
    public void catchMouse(){
        String winnerTest = catchingMouse(2, 5, 4);
        Assertions.assertEquals("Cat B", winnerTest);
    }

    @Test
    public void catchMouse2(){
        String winnerTest2 = catchingMouse(1, 2, 3);
        Assertions.assertEquals("Cat B", winnerTest2);
    }

    @Test
    public void catchMouse3(){
        String winnerTest3 = catchingMouse(2, 1, 3);
        Assertions.assertEquals("Cat A", winnerTest3);
    }

    @Test
    public void catchMouse4(){
        String winnerTest4 = catchingMouse(1, 3, 2);
        Assertions.assertEquals("Mouse C", winnerTest4);
    }

}
