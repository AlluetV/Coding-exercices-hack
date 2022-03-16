package com.alluet.hackerrank.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class StoneDivision {

    public static Long zero = 0L;

    static int findM(HashSet<Integer> piles){
        int m = 0;
        while(piles.contains(m)){
            m++;
        }
        return m;
    }

    static int getPiles(long n, List<Long> s, Hashtable<Long, Integer> stonePiles){

        if (n == zero){
            return 0;
        }
        else if (stonePiles.containsKey(n)){
            return stonePiles.get(n);
        }
        else{
            HashSet<Integer>nextPositions = new HashSet<Integer>();
            for (int i = 0; i < s.size(); i++){
                if (n % s.get(i) == zero){
                    long pilesize = n/ s.get(i);
                    int g = 0;
                    if(s.get(i)%2L != 0L){
                        g = getPiles(pilesize, s, stonePiles);
                    }

                    nextPositions.add(g);
                }
            }
            if(nextPositions.isEmpty()){
                return 0;
            }
            else{
                int m = findM(nextPositions);
                stonePiles.put(n, m);
                return m;
            }
        }
    }

    public static String stoneDivision(long n, List<Long> s) {
        // Write your code here

        Hashtable<Long, Integer> stoneGroups = new Hashtable<Long, Integer>();
        Collections.sort(s);

        int smallPiles = getPiles(n, s,stoneGroups);
        if (smallPiles == 0){
            return new String("Second");
        }
        else{
            return new String("First");
        }

    }

    @Test
    public void SDivision1(){
        String stones1 = stoneDivision(15L, Arrays.asList(5L, 2l,3L));
        Assertions.assertEquals("Second", stones1);
    }

}


