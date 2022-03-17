package com.alluet.hackerrank.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ChocolateInBox {
    public static int chocolateInBox(List<Integer> arr) {
        // Write your code here
        int  firstMove= 0;
        return firstMove;
    }

    @Test
    public void optimalPlay(){
        int oMoves1 = chocolateInBox(Arrays.asList(2,3));
        Assertions.assertEquals(1, oMoves1);
    }

    @Test
    public void optimalPlay2(){
        int oMoves2 = chocolateInBox(Arrays.asList(1,1,1,1));
        Assertions.assertEquals(0, oMoves2);
    }

}
