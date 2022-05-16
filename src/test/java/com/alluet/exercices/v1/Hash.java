package com.alluet.exercices.v1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


public class Hash {

    @Test
    public void testHashSet(){
        MyObject a = new MyObject(0,"1");
        MyObject b = new MyObject(0, "1");
        Set<MyObject> mySet = new HashSet<>();
        mySet.add(a);
        System.out.println(a==b);
        System.out.println(a.equals(b));
        boolean added = mySet.add(b);
        System.out.println(mySet);
        Assertions.assertFalse(added);
    }


    public class MyObject{

        private Integer i;
        private String s;

        public MyObject(Integer i, String s) {
            this.i = i;
            this.s = s;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyObject myObject = (MyObject) o;
            return Objects.equals(i, myObject.i) && Objects.equals(s, myObject.s);
        }

        @Override
        public int hashCode() {
            return Objects.hash(i, s);
        }

        @Override
        public String toString() {
            return "MyObject{" +
                    "i=" + i +
                    ", s='" + s + '\'' +
                    '}';
        }
    }

}
