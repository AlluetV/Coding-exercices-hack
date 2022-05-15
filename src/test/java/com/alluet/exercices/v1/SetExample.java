package com.alluet.exercices.v1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class SetExample {
    // You have two list , listOne with the values of ABCDEF
    // and the listTwo that holds the values of ACFGHI
    //the task is creates a method that return a list of unique values
    //using the values of both lists.

    public static Set<String> uniqueValues(List<String> listOne, List<String> listTwo){
        Set<String> uniqueValues = new LinkedHashSet<>(listOne);
        List<String> duplicateValues = new ArrayList<>();
        //uniqueValues.addAll(listOne);

        for (int i = 0; i < listTwo.size() ; i++) {

            duplicateValues.add(listOne.get(i));

            if(uniqueValues.add(listTwo.get(i))){
                System.out.println(uniqueValues);
            }else{
                duplicateValues.add(listTwo.get(i));
            }
        }
        System.out.println(duplicateValues);
        return uniqueValues;
    }


    @Test
    public void testUniqueVals(){
        Set<String> testVal = uniqueValues( List.of("A","B","C","D","E","F") ,
                List.of("A","C","F","H","I"));
        Assertions.assertEquals(Set.of("A","B","C","D","E","F","H","I"), testVal);
    }

    @Test
    public void testUniqueVals2(){
        Set<String> testVal2 = uniqueValues( List.of("A","A","A","D","E","F") ,
                List.of("B","B","D","B","A","A"));
        Assertions.assertEquals(Set.of("A","B","D","E","F"), testVal2);
    }

    @Test
    public void testUniqueVals3(){
        Set<String> testVal3 = uniqueValues( List.of("A","A","A","D","e","F"),
                List.of("B","E","D","B","A","F"));
        Assertions.assertEquals(Set.of("A","B","D","E","e","F"), testVal3);
    }

}
