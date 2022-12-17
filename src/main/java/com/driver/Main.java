package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(60, 0);
        mercedes.accelerate(-60);
        mercedes.accelerate(0);
//        Boat b=new Boat();
//        b.setName("MyBoat");
//       System.out.print(b.getVehicleName());
    }
}