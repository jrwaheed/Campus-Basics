package at.ran.cc.basics;

public class Cars {

    public int fuelCapacity;
    public int fuelConsumption;
    public boolean isLuxury;
    public String vehicleBrand;
    public String color;
    public int price;


    public void joyRiding() {
        this.fuelCapacity = this.fuelCapacity - this.fuelConsumption;
    }


}
