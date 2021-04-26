package at.jamal.cc.oo.vehicles;

public class Vehicle {
    //Mandatory fields

    public String vehicleBrand = "Mercedes";
    public int milesPerGallon = 20;
    private boolean isLuxury = true;
    private int price = 175000;
    private boolean isForVIP = true;
    private Engine engine;
    private Tank tank;


    public Vehicle(Boolean isLuxury, int price, Boolean isForVIP, Engine engine, Tank tank) {
        this.isLuxury = isLuxury;
        this.price = price;
        this.isForVIP = isForVIP;
        this.engine = engine;
        this.tank = tank;
    }

    public boolean getisForVIP() {
        return isForVIP;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price) {
        if (price >= 100000) {
            System.out.println("The price price change of the car has been approved.");
            this.price = price;
        } else {
            System.out.println("This price is inapplicable");
        }
    }

    public Engine getEngine() {

        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public void drive(int speedOfVehicle){
        System.out.println("You are traveling at " + speedOfVehicle + "mph");

    }
}

