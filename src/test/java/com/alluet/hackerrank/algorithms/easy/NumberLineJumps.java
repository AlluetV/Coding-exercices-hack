package com.alluet.hackerrank.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberLineJumps {

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if(v1 > v2 && (((x2-x1)%(v2-v1)) == 0)){
            return "YES";
        }
        return "NO";
    }

    public static String kangaroo2(int x1, int v1, int x2, int v2) {
        // Write your code here
        if(x2 > x1 && v2>=v1){
            return "NO";
        }
        int jump = 0;
        while(x1<=10000 && x2<=10000){
            jump++;
            x1 += v1;
            x2 += v2;
            System.out.println("Jump "+ jump + " x1=" + x1 + " x2="+x2);
            if(x1 == x2){
                return "YES";
            }
        }
        return "NO";
    }


    @Test
    public void testInputs(){
        Assertions.assertEquals("YES", kangaroo(2, 1, 1, 2));
        Assertions.assertEquals("YES", kangaroo(0, 3, 4, 2));
    }

    @Test
    public void testNoInputs(){
        Assertions.assertEquals("NO", kangaroo(0, 2, 5, 3));
        Assertions.assertEquals("NO", kangaroo(0, 1, 1, 1));

    }
}
