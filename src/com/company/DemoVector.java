package com.company;

import java.util.ArrayList;
import java.util.Vector;

public class DemoVector {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> v1 = new ArrayList<>(); // increase 50% , not threadsafe,fast,preferred

        Vector<Integer> v = new Vector<>(); // increase 100% and synchronize , threadsafe , slow

        v.add(4);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(71);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(72);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(7);
        v.add(74);
        v.add(7);
        v.add(7);

        v.remove(0);

        for(int i : v) {
            System.out.println(i);
        }

        System.out.println(v.capacity());
        System.out.println(v1.size());
    }
}
