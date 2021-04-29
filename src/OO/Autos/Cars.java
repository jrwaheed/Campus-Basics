package OO.Autos;

public class Cars {
    private String carColor;
    private int maxSpeed;
    private float basePrice;
    private double baseConsumption;
    private int kiloMetersTraveled;
    private Engines engine;
    private Manufacturers manufacturer;


    public Cars(String carColor, int maxSpeed, float basePrice, double baseConsumption, int kiloMetersTraveled, Engines engine, Manufacturers manufacturer) {
        this.carColor = carColor;
        this.maxSpeed = maxSpeed;
        this.basePrice = basePrice;
        this.baseConsumption = baseConsumption;
        this.kiloMetersTraveled = kiloMetersTraveled;
        this.engine = engine;
        this.manufacturer = manufacturer;
    }


    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public double getBaseConsumption(){return baseConsumption;}

    public int getKiloMetersTraveled(){return kiloMetersTraveled;}

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public Engines getEngine() {
        return engine;
    }

    public void setEngine(Engines engine) {
        this.engine = engine;
    }

    public Manufacturers getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturers manufacturer) {
        this.manufacturer = manufacturer;
    }





    }



