package com.alluet.hackerrank.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> gradeList = new ArrayList<>();
        int gradeRound = 0;

        for (Integer grade : grades) {
            if(grade < 38 || grade % 5 < 3){
                gradeList.add(grade);
            }else {
                int round = 5 - (grade % 5);
                gradeRound = round +grade;
                gradeList.add(gradeRound);
            }
        }

        return gradeList;
    }

    @Test
    public void list1(){
        List<Integer> listOne = gradingStudents(Arrays.asList(73, 67, 38, 33));
        Assertions.assertEquals(Arrays.asList(75, 67, 40, 33), listOne );
    }

    @Test
    public void list2(){
        List<Integer> listTwo = gradingStudents(Arrays.asList(84, 29, 57));
        Assertions.assertEquals(Arrays.asList(85, 29, 57),listTwo);
    }
}
