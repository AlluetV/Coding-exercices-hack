package com.alluet.hackerrank.algorithms.easy2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecords {

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here

        int max = scores.get(0);
        int min = scores.get(0);
        int countMin = 0;
        int countMax = 0;

        for (int i = 0; i < scores.size(); i++) {

            if(scores.get(i) < min){
                min = scores.get(i);
                countMin += 1;
            }else if(scores.get(i) > max ){
                max = scores.get(i);
                countMax += 1;

            }
        }
        return Arrays.asList(countMax, countMin);

    }

    @Test
    public void breakedScores(){
        List<Integer> bScores = breakingRecords(List.of( 10, 5, 20, 20, 4, 5, 2, 25, 1));
        Assertions.assertEquals(List.of(2, 4), bScores);
    }

    @Test
    public void breakedScoresTwo(){
        List<Integer> bScoresTwo = breakingRecords(List.of(3, 4, 21, 36, 10, 28, 35, 5, 24, 42));
        Assertions.assertEquals(List.of(4,0), bScoresTwo);
    }
}
