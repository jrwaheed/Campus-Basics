package at.ran.cc.basics;

public class Scratch {

    public static void main(String [] args) {

        Cars car1 = new Cars("green");
        car1.vehicleBrand = "Jaguar";
        car1.color = "White";
        car1.fuelCapacity = 50;
        car1.fuelConsumption = 6;
        car1.isLuxury = true;
        car1.currentFuelLevel = 2;

        Cars car2 = new Cars("red");
        car2.vehicleBrand = "Honda";
        car2.color = "Red";
        car2.fuelCapacity = 70;
        car2.fuelConsumption = 3;
        car2.isLuxury = false;
        car2.currentFuelLevel = 50;



        Cars car3 = new Cars("blue");

        System.out.println(car1.color);
        /*
        System.out.println("Started out with " + car1.fuelCapacity + " liters when we started.");
        car1.joyRiding();
        System.out.println("Ended with " + car1.fuelCapacity + ".");
        if(car1.isLuxury) {
            System.out.println("But at least its a luxury ride!");
        } else {
            System.out.println("But damn. Its a beater.");
        }
        car2.pumpTheBrakes();
        car1.turboBoost();
        car2.turboBoost();
        car1.honk(4);
        car1.remainingRange();
        car2.remainingRange();

         */
    }



}
