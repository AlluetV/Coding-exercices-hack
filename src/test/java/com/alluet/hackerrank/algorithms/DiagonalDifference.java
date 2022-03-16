package com.alluet.hackerrank.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int primary = 0;
        int secondary = 0;
        int difference = 0;
        int size = arr.size() - 1;

        for (int i = 0; i < arr.size(); i++) {
            primary += arr.get(i).get(i);
            secondary += arr.get(i).get(size - i);
        }

        difference = Math.abs(primary - secondary);
        return difference;
    }

    @Test
    public void sample(){
        int result = diagonalDifference(List.of(
                List.of(11,2,4),
                List.of(4,5,6),
                List.of(10,8,-12)
        ));
        Assertions.assertEquals(15,result);
    }

}

