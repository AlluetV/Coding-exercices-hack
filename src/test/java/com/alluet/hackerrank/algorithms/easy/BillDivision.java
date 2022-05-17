package com.alluet.hackerrank.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BillDivision {

    public static String bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here

        int fullSum = 0;

        for (int i = 0; i < bill.size(); i++) {
            fullSum += bill.get(i);
            System.out.println(fullSum);
        }

        System.out.println(bill.get(k));

        int notEaten = (fullSum-bill.get(k))/2;
        System.out.println(notEaten);

        int anna = b - notEaten;
        System.out.println(anna);
        if(anna == 0){
            return "Bon Appetit";
        }else{
            String totalStr = String.valueOf(anna);
            return totalStr;
        }

    }

    @Test
    public void inputTest(){
        String testBill = bonAppetit(List.of(2,4,6), 2, 3);
        Assertions.assertEquals("Bon Appetit", testBill);
    }

    @Test
    public void inputTest2(){
        String testBill2 = bonAppetit(List.of(2,4,6), 2, 6);
        Assertions.assertEquals("3", testBill2);
    }

    @Test
    public void inputTest3(){
        String testBill3 = bonAppetit(List.of(3, 10, 2, 9), 1, 12);
        Assertions.assertEquals("5", testBill3);
    }

    @Test
    public void inputTest4(){
        String testBill4 = bonAppetit(List.of(3, 10, 2, 9), 1, 7);
        Assertions.assertEquals("Bon Appetit", testBill4);
    }
}
