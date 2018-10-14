package com.company;

import com.sun.org.apache.regexp.internal.RE;

public class Main {

    public static void main(String[] args) {
	// write your code here

        class Flight {
           private int flightNumber;


           public  Flight() {}

           private Flight(int flightNumber){
               this.flightNumber = flightNumber;
           }

           private char flightClass;

           public double getPassenger() {
               return 100.0d;
           }

           @Override
           public boolean equals(Object o) {
//               if(equals(o)){
//                   return true;
//               }   prevent recursion

               if (super.equals(o)){
                   return true;
               }
               if(!(o instanceof Flight)){
                   return false;
               }
               Flight other = (Flight) o;

               return flightNumber == other.flightNumber && flightClass == other.flightClass;
           }

           @Override
            public  String toString() {
               if (flightNumber > 0)
                   return "FLIGHT #" + flightNumber;

               else
                   return "Flight Class " + flightClass;
           }


       }

       class CargoFlight extends Flight {
            float maxCargoFlight = 1000.0f;
            public CargoFlight() {}
            public CargoFlight(int flightNumber) {
                super(flightNumber);
            }
           public CargoFlight(int flightNumber,float maxCargoFlight) {
               // super(FlightNumber);
               this(flightNumber);
               this.maxCargoFlight = maxCargoFlight;
           }

           public CargoFlight(float maxCargoFlight) {
                this.maxCargoFlight = maxCargoFlight;
           }


       }

       Flight f175 = new Flight(175);
       CargoFlight cf = new CargoFlight();
       CargoFlight cf294 = new CargoFlight(294);
       CargoFlight cf85 = new CargoFlight(85,2000.0f) ;
       CargoFlight c77 = new CargoFlight(1000.0f);

        CalculateBase[] calculators = {
                new Divider(100.0d,50.0d),
                new Adder(25.0d,92.0d),
                new Subtracter(100.0d,200.0d),
                new Multiply(20.0d,20.2d)
        };

        for (CalculateBase calculator:calculators) {
            calculator.calculate();
           // System.out.print("results using inheritance result : ");
          //  System.out.println(calculator.getResult());
        }

        String s1 = "I Love";
        s1 += " Java";

        String s2 = "I";
        s2 += " Love Java";
        System.out.print(s1);
        System.out.print(s2);

        System.out.print(s1 == s2);
        System.out.print(s1.equals(s2));

        if(s1 == s2) {

        }

        Flight f1 = new Flight(175);
        Flight f2 = new Flight(175);

        System.out.print(f1 == f2);  // false
        System.out.print(f1.equals(f2)); // true

        Flight f11 = new Flight(175);
        Flight f22 = f11;

        System.out.print(f11.equals(f22 )); // true

        // Use Final to prevent extending / inheritance x ABSTRACT

     abstract class Pilot {
        private Flight currentFlight;

        public void fly(Flight f) {
            if (canAccept(f)) {
                currentFlight = f;
            } else {
                handleCantAccept();
            }
        }

        public abstract boolean canAccept(Flight f); // Signature

        private void handleCantAccept() {
            System.out.println("CAN'T ACCEPT");
        }
    }

     class CargoOnlyPilot extends Pilot {
        @Override
        public boolean canAccept(Flight f){
            return f.getPassenger() == 0;
        }
    }


     class FullLincensePilot extends Pilot {

        @Override
        public boolean canAccept(Flight f) {
            return true;
        }
    }

     class Cargo extends Flight{
         float maxCargoSpace = 100.0f;
         public Cargo(int flightNumber) {
             super(flightNumber);
         }

         public Cargo(int flightNumber, float maxCargoSpace) {
            // super(flightNumber);
             this(flightNumber);
             this.maxCargoSpace = maxCargoSpace;
         }

         public Cargo(){}

     }

     Flight f176 = new Flight(176);
     Cargo cf1 = new Cargo();

     Cargo c22 = new Cargo(298);
     Cargo c23 = new Cargo(99,2000.0f);

     System.out.print(c22);

     String name = "Ashwin";

     System.out.print("Hello" + name);

     String greeting = "Hello";

     greeting += " ";
     greeting += "World"; // strings are immutable

     System.out.print(greeting.isEmpty());


     String s11 = "I Love";
     s11 += " Angular";

     String s22 = "I";
     s22 += " Love Angular";

     System.out.print(s11==s22); // false
     System.out.print(s11.equals(s22)); // true

     String s33 = s11.intern();
     String s44 = s22.intern();

     System.out.print(s33 == s44); // true

        int iVal = 100;
        String sVal = String.valueOf(iVal);

        System.out.print(sVal);

        int i =2,j=3;

        int result = i * j;

        System.out.println(i + " * " + j + " = " + result);

        Flight myFlight = new Flight(175);

        System.out.print("My Flight is " + myFlight);

        StringBuilder sb = new StringBuilder(40);

        String location = "Florida";

        sb.append("I flew to ");
        sb.append("location");
        sb.append(" on ");
        sb.append(myFlight);

        int time = 9;
        int pos = sb.length() - " on ".length() - myFlight.toString().length();
        sb.insert(pos," at ");
        sb.insert(pos + 4 , time);
        System.out.println(sb);



    }
}
