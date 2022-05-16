package com.alluet.hackerrank.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Staircase {
    public static List<String> staircase(int n) {
        // Write your code here
        List<String> row = new ArrayList<>();
        List<String> staircase = new ArrayList<>();
        int counter = 0;

        for(int i = 0; i < n; i++){
            counter++;

            for(int j = n-1 ; j > i; j--){
                System.out.print(" ");
                //row.add(j, " ");
            }

            for(int k = 0; k <= counter-1; k++){
                System.out.print("#");
                //row.add(k,"#");
            }

            System.out.print("\n");

        }

        return null ;
    }

    @Test
    public void staircase1(){
        List<String> staircase1 = staircase(4);
        /*Assertions.assertEquals(List.of(
                "   #",
                "  ##",
                " ###",
                "####"
                ), staircase1);*/

    }
    @Test
    public void staircase2(){
        List<String> staircase2 = staircase(6);
        /*Assertions.assertEquals(List.of(
                "     #",
                "    ##",
                "   ###",
                "  ####",
                " #####",
                "######"
        ), staircase2);*/

    }
}
