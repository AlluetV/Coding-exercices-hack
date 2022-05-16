package com.alluet.hackerrank.algorithms.easy2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {


    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        int alice =0;
        int bob =0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i) ){
                alice += 1;
            }else if(a.get(i) < b.get(i)){
                bob += 1;
            }
        }
//        List<Integer> result = new ArrayList<>();
//        result.add(alice);
//        result.add(bob);
//        return result;
        return List.of(alice, bob);
    }

    @Test
    public void  sample0(){
        List<Integer> result = compareTriplets(List.of(5, 6, 7), List.of(3, 6, 10));
        Assertions.assertEquals(List.of(1,1), result);
    }

    @Test
    public void  sample1(){
        List<Integer> result = compareTriplets(List.of(17, 28, 30), List.of(99, 16, 8));
        Assertions.assertEquals(List.of(2,1), result);
    }

}
