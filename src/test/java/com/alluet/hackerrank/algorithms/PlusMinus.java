package com.alluet.hackerrank.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PlusMinus {

    public static List<Float> plusMinus(List<Integer> arr) {

        float positives = 0;
        float negatives = 0;
        float zeros = 0;
        float n = arr.size();

        for (Integer integer : arr) {
            if (integer > 0) {
                positives += 1;
            } else if (integer < 0) {
                negatives += 1;
            } else {
                zeros += 1;
            }
        }


        float ratioP = positives / n;
        float ratioN = negatives / n;
        float ratioZ = zeros / n;

        System.out.println(ratioP);
        System.out.println(ratioN);
        System.out.println(ratioZ);

        return List.of( ratioP, ratioN, ratioZ);
    }

    @Test
    public void solution(){
        List<Float> solution1 = plusMinus(List.of(0,1,1,-1,-1));
        Assertions.assertEquals(List.of(0.400000f, 0.400000f, 0.200000f), solution1);
    }

    @Test
    public void solution2(){
        List<Float> solution2 = plusMinus(List.of(-4, 3,-9, 0, 4, 1));
        Assertions.assertEquals(List.of(0.5f, 0.33333334f, 0.16666667f), solution2);
    }

}
