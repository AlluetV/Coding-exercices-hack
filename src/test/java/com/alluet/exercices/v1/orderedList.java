package com.alluet.exercices.v1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class orderedList {

    public static List<String> ordering(List<String> list){
        List<String> solution = new ArrayList<>();

       solution = list.stream().sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());


        return solution ;
    }

    @Test
    public void listTest(){
        List<String> listTest = new ArrayList<>();
        Collections.addAll(listTest,"Germany","england","Spain");

        List<String> test = ordering(listTest);
        Assertions.assertEquals(List.of("england","Germany","Spain"),test);
    }


}
