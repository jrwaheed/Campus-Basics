package at.ran.cc.OOP.intro_OO;

public class Engine {
    private int cylinders = 4;
    private double displacement = 2.5;
    public enum FUEL {Petro, Diesel}
    private FUEL fuelType;


    public Engine(int cylinders, double displacement, FUEL fuelType) {
        this.cylinders = cylinders;
        this.displacement = displacement;
        this.fuelType = fuelType;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public FUEL getFuelType() {
        return fuelType;
    }

    public void setFuelType(FUEL fuelType) {
        this.fuelType = fuelType;
    }

    public void sayHello(){
        System.out.println("Hi I am an engine");
    }

    public void engineRPM(int revolutionsPerMinute) {
        if(revolutionsPerMinute > 100 || revolutionsPerMinute < 1) {
            System.out.println("Revolutions per minute, must be between 1 and 100.");
        } if(revolutionsPerMinute < 50 && revolutionsPerMinute > 1) {
            System.out.println("Move it! Grandma.");
        } if(revolutionsPerMinute > 51 && revolutionsPerMinute < 100) {
            System.out.println("Now we are moving!.");
        }
    }
}
