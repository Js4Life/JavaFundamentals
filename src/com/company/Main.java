package com.company;

import java.util.ArrayList;
import java.util.Collection;


public class Main {

    public static void main(String[] args) {

       int b[] = new int[4];

       System.out.println("1.integer using new " +b);

       System.out.println("Collections Example");

       Collection valueA = new ArrayList();

        valueA.add(1);
        valueA.add(2);
        valueA.add(9);

       System.out.println("2.Collection using no types " +valueA);

       Collection<Integer> value = new ArrayList<>();

        value.add(5);
        value.add(6);
        value.add(8);

        System.out.println("3.Collection using array " + value);



    }
}
