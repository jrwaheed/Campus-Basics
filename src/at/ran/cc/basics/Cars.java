package at.ran.cc.basics;

public class Cars {

    // Objektvariablern GEDÄCHTNIS
    public double fuelCapacity;
    public double fuelConsumption;
    public boolean isLuxury;
    public String vehicleBrand;
    public String color = "white";
    public int price;
    public  double currentFuelLevel;


    public void joyRiding() {
        this.fuelCapacity = this.fuelCapacity - this.fuelConsumption;
    }

    public void pumpTheBrakes() {
        System.out.println("I brake");
    }

    public void turboBoost() {
        if((this.currentFuelLevel / this.fuelCapacity) > .1 ) {
            System.out.println("Punch it, brah!");
        } else {
            System.out.println("Running of E, Partner.");
        }
    }

    public void honk(int repetitions) {
        for (int i = 0; i < repetitions; i++) {
            System.out.println("HONK!");
        }
    }

    public void remainingRange() {
        double remainingRange = ((this.currentFuelLevel/this.fuelConsumption) * 100);
        System.out.println("Your current range is " + remainingRange);
    }

    public Cars(String color) {
       this.color = color;
    }

}
