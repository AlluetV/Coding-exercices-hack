package com.alluet.hackerrank.algorithms.easy3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ElectronicsShop {

    public static int shopping(int b, List<Integer> keyboards, List<Integer> drives){

        int myShopping = 0;
        int outB = -1;

        List<Integer> estimates = new ArrayList<>();

        Collections.sort(keyboards);
        Collections.sort(drives);

        for (Integer i : keyboards) {
            int sum =0;
            for (Integer j : drives) {
                sum = i + j;
                estimates.add(sum);
            }
        }

       // Collections.sort(estimates);

        System.out.println(estimates);

        for (int i = 0; i < estimates.size(); i++) {
            if( estimates.get(i) > myShopping && estimates.get(i) <= b){
                myShopping = estimates.get(i);
            }
        }

        if(myShopping == 0){
            System.out.println(outB);
            return outB = -1;

        }else{
            System.out.println(myShopping);
            return myShopping;
        }
    }

    @Test
    public void shopTest(){
        List<Integer> keyboardTest = new ArrayList<>();
        Collections.addAll(keyboardTest,40, 50, 60);

        List<Integer> drivesTest = new ArrayList<>();
        Collections.addAll(drivesTest, 5, 8, 12);

        int myShopTest = shopping(60, keyboardTest, drivesTest);
        Assertions.assertEquals(58, myShopTest);
    }

    @Test
    public void shopTest2(){
        List<Integer> keyboardTest2 = new ArrayList<>();
        Collections.addAll(keyboardTest2,3, 1);

        List<Integer> drivesTest2 = new ArrayList<>();
        Collections.addAll(drivesTest2, 5, 2, 8);

        int myShopTest2 = shopping(10,keyboardTest2,drivesTest2);
        Assertions.assertEquals(9, myShopTest2);
    }

    @Test
    public void shopTest3(){
        List<Integer> keyboardTest3 = new ArrayList<>();
        Collections.addAll(keyboardTest3,4);

        List<Integer> drivesTest3 = new ArrayList<>();
        Collections.addAll(drivesTest3, 5);

        int myShopTest3 = shopping(5,keyboardTest3, drivesTest3);
        Assertions.assertEquals(-1, myShopTest3);
    }

}
