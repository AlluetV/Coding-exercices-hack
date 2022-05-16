package com.alluet.hackerrank.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        Map<Integer, Integer> spottedBirds = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {

            if (!spottedBirds.containsKey(arr.get(i))) {
                spottedBirds.put(arr.get(i), 1);
            } else {
                int count = spottedBirds.get(arr.get(i));
                spottedBirds.replace(arr.get(i), ++count);
            }
        }

        int mostSpotted = 0;
        int idBird = 0;

        for (Map.Entry<Integer, Integer> entry : spottedBirds.entrySet()){
            System.out.println("Bird Id = " + entry.getKey() +
                    ", Times spotted = " + entry.getValue());

            if(mostSpotted < entry.getValue()){
                mostSpotted = entry.getValue();
                idBird = entry.getKey();
            }
        }

        return idBird;
    }


    @Test
    public  void testInput(){
        int birdTest = migratoryBirds(List.of(1,1,2,2,3));
        Assertions.assertEquals(1, birdTest);
    }

    @Test
    public  void testInput2(){
        int birdTest2 = migratoryBirds(List.of(1,4,4,4,5,3));
        Assertions.assertEquals(4, birdTest2);
    }


    @Test
    public  void testInput3(){
        int birdTest3 = migratoryBirds(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4));
        Assertions.assertEquals(3, birdTest3);
    }

    @Test
    public  void testInput4(){
        int birdTest = migratoryBirds(List.of(2,2,1,1,3));
        Assertions.assertEquals(1, birdTest);
    }
}
