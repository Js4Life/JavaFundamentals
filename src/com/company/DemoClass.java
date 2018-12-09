package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoClass {
    public static void main(String[] args) throws Exception {


        int values[] = new int[4];

        Object values1[] = new Object[4];

        values1[0] = "naveen";
        values1[1] = 7;

        Collection<Integer> valuesC = new ArrayList<Integer>();
        valuesC.add(4);
        valuesC.add(8);
        valuesC.add(99);



        // iterator

        Iterator i = valuesC.iterator();

        // without loop
//
//        System.out.println("Normal Iterator");
//
//        System.out.println(i.next());
//        System.out.println(i.next());
//        System.out.println(i.next());

        System.out.println("Normal Iterator using while loop");

        while(i.hasNext()) {
            System.out.println(i.next());
        }

        // Enhanced For Loop

        System.out.println("enhanced for-loop ");

        for (int iterate :valuesC) {
            System.out.println(iterate);
        }



    }
}
