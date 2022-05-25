package com.alluet.exercices.v1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RiceBags {
    //Provided that you have a given number of small rice bags (1 kilo each) and big rice bags (5 kilos each),
    // write a method that returns true if it is possible to make a package with goal kilos of rice.

    public Boolean packageRice(Integer big, Integer small, Integer goal) {
        int kgB = big * 5;
        int kgS = small;
        int bagB = 0;
        int bagS = 0;

        if(kgB+kgS > goal){
            int partialB =   goal / 5;
            if(partialB < big){
                bagB = partialB;
            }else{
                bagB = big;
            }
            bagS = goal - (bagB * 5);
            System.out.println("Big rice bags: " + bagB);
            System.out.println("Small rice bags: " + bagS);
            return true;
        }else{
            return false;
        }
    }

    @Test
    public void bagsTest(){
        boolean output = packageRice(10,15,30);
        Assertions.assertTrue(output);
    }

    @Test
    public void bagsTest2(){
        boolean output2 = packageRice(1,6,15);
        Assertions.assertFalse(output2);
    }

    @Test
    public void bagsTest3(){
        boolean output3 = packageRice(10,15,34);
        Assertions.assertTrue(output3);
    }

    @Test
    public void bagsTest4(){
        boolean output4 = packageRice(1,15,18);
        Assertions.assertTrue(output4);
    }
}
