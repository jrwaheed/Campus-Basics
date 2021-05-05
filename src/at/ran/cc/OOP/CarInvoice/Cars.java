package at.ran.cc.OOP.CarInvoice;

public class Cars {
    private String carColor;
    private String carBrand;
    private int carDoors;
    private Engines carEngine;
    private float basePrice;
    private float fullPrice;

    public float getBasePrice() {
        return basePrice;
    }

    public Cars(String carColor, String carBrand, int carDoors, Engines carEngine, float basePrice) {
        this.carColor = carColor;
        this.carBrand = carBrand;
        this.carDoors = carDoors;
        this.carEngine = carEngine;
        this.basePrice = basePrice;
        this.fullPrice = fullPrice;
    }

    public String getCarColor(){
        return carColor;
    }

    public String getCarBrand(){
        return carBrand;
    }

    public int getCarDoors(){
        return carDoors;
    }

    public Engines getCarEngine(){
        return carEngine;
    }
}
