package com.company;

import java.util.ArrayList;
import java.util.List;



 class Container<T extends Number>{

   T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show() {
       System.out.println(value.getClass().getName());
   }

   public void demo(ArrayList<? super T> obj) {
        System.out.println();
   }

}

public class GenericsDemo {

    public static void main(String args[]) {


        Container<Integer> obj = new Container<>();

      //  obj.value = 9.9;
        obj.show();

        obj.demo(new ArrayList<Number>());









//        List values = new ArrayList<>();
//
//        values.add(7);
//        values.add("naveen");
//
//        int i = Integer.parseInt(values.get(1).toString());
//
//        System.out.println(i);

        // NumberFormatException


    }
}
