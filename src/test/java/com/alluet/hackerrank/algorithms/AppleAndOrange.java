package com.alluet.hackerrank.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleAndOrange {
    public static List<Integer> countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
         int samsApples = 0;
         int samsOranges = 0;

         List<Integer> aDistances = new ArrayList<>();
         List<Integer> oDistances = new ArrayList<>();

         //apples
        for (int i = 0; i < apples.size() ; i++) {
            int location = a + apples.get(i);
            aDistances.add(location);
            if(location >= s && location <= t){
                samsApples ++;

            }
        }

        //oranges
        for (int i = 0; i < oranges.size(); i++) {
            int location = b + oranges.get(i);
            oDistances.add(location);
            if(location >= s && location <= t){
                samsOranges ++;
            }
        }

        //System.out.println("Apples" + aDistances);
        System.out.println(samsApples);
       // System.out.println("Oranges" + oDistances);
        System.out.println(samsOranges);

        return Arrays.asList(samsApples,samsOranges);
    }

    @Test
    public void fruit(){
        List<Integer> fruits = countApplesAndOranges(7, 10, 4, 12,Arrays.asList(2,3,-4),Arrays.asList(3,-2,-4) );
        Assertions.assertEquals(Arrays.asList(1, 2), fruits);
    }

    @Test
    public void fruit2(){
        List<Integer> fruit2 = countApplesAndOranges(7,11,5,15,Arrays.asList(-2, 2, 1),Arrays.asList(5, -6));
        Assertions.assertEquals(Arrays.asList(1,1), fruit2);
    }

}
