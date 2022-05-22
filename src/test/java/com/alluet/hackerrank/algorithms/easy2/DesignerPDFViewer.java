package com.alluet.hackerrank.algorithms.easy2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class DesignerPDFViewer {

    public static int designerPdfViewer(List<Integer> h, String word) {
        // Write your code here
        Map<Character, Integer> heightsLetters = new HashMap<>();
        List<Character> letters = new ArrayList<>();
        Collections.addAll(letters, 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');

        List<Integer> wordH = new ArrayList<>();

        for (int i = 0; i < h.size(); i++) {
            heightsLetters.put(letters.get(i),h.get(i));
        }

        //
        //reading the map
        for (int i = 0; i <word.length() ; i++) {
            for(Map.Entry<Character, Integer> entry : heightsLetters.entrySet()){
                //System.out.println("Letter: " + entry.getKey() + ", Value: "+ entry.getValue());
                if(entry.getKey().equals(word.charAt(i))){
                    wordH.add(entry.getValue());
                }
            }
        }

        Collections.sort(wordH);
        int output = word.length() * wordH.get(word.length()- 1);

        System.out.println(wordH.get(word.length()- 1));
        System.out.println(word.length());

        //System.out.println(heightsLetters);
        System.out.println(wordH);


        return output;
    }

    @Test
    public void testViewer(){
        int output = designerPdfViewer(List.of(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5),
                "abc");

        Assertions.assertEquals(9, output);
    }

    @Test
    public void testViewer2(){
        int output2 = designerPdfViewer(List.of(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7),
                "zaba");

        Assertions.assertEquals(28, output2);
    }
}
