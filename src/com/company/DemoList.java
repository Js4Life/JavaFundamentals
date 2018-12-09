package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoList {
    public static void main(String args[]) {
        List<Integer> valList = new ArrayList<>();
        valList.add(100);
        valList.add(39);
        valList.add(41);

        valList.add(1,2);

        Comparator<Integer> com = (o1,o2) ->{
                return o1%10>o2%10?1:-1;
            };


        Collections.sort(valList,com);
     //   Collections.reverse(valList);
     //   System.out.println(valList);

        for (int i:valList){
            System.out.println(i);
        }

      //  valList.forEach(System.out::println); // Stream API ...Lamba Expression
    }
}
