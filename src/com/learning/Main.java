package com.learning;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int v1=5;
        int v2=5;

        int vmax= v1 > v2 ? v1 : v2;

        System.out.println(vmax);

        float students = 30;
        float rooms = 4;

        float studentsRoom = rooms == 0.0f ? 0.0f : students/rooms;

        System.out.println(studentsRoom);

        if(v1 > v2)
            System.out.println("v1 is bigger");
        else
            System.out.println("v1 is not bigger");


        if(v1 < v2 )
            System.out.println("v1 is not bigger");
        else if (v1 > v2)
            System.out.println("v1 is  bigger");
        else
            System.out.println("v1 and v2 are equal");


        int a1 = 10, b1 = 4,diff=0;

        if(a1 > b1){
            diff = a1 - b1;
            System.out.println("a1 is bigger");
            System.out.println(diff);
        }
        else if(b1 > a1){
            diff = b1 - a1;
            System.out.println("b2 is bigger");
            System.out.println(diff);
        } else {
            System.out.println("both are equal");
        }


        float stds = 0.0f;
        float roms = 4.0f;

        if(stds > 0.0f){
            if (roms > 0.0f)
                System.out.println(stds/roms);
        }

         else
            System.out.println("no students");


        // block scope

        float std = 30.0f;
        float room = 4.0f;

        if (room > 0.0f) {
            float avg = students/room;
            System.out.println(avg);
        }
      //  System.out.println(avg);


        int a = 20,b=14,c=5;

        if(a > b & b > c) {
            System.out.println("a is greater than c");
        }

        boolean done = false;

        if(!done) {
            System.out.println("keep going");
        }

        // conditional

        int s = 150;
        int r = 2;

        if(r>0 && s/r > 30) {
            System.out.println("crowded");
        }

        // Calc Engine

        double val1 = 100.0d;
        double val2 = 50.0d;
        double result ;
        char opCode = 'd';

        if(opCode == 'a')
            result = val1 + val2;
        else if(opCode == 's')
            result = val1 - val2;

        else if (opCode =='d')

            result = val2 !=0 ? val1/val2 : 0.0d;

//            if(val2 !=0)
//
//            result = val1/val2;
//
//        else
//
//            result =0;

        else if (opCode=='m')
            result = val1 * val2;
        else {
            System.out.println("Error - Invalid code");
            result = 0.0d;
        }
        System.out.println(result);



        // While Loop

        int kVal = 5;
        int factorial = 1;

        while (kVal>1) {
            factorial *=kVal;
            kVal -=1;

        }
        System.out.println(factorial);

        // while loop 1

        int k=5;
        int fact=1;

        while (k>1)
            fact *= k--;
        System.out.println(fact);



    }
}
