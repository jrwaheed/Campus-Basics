package at.ran.cc.OOP.Autos;

public class Engines {
    public enum FUEL {DIESEL, GASOLINE};
    private FUEL fuelType;
    private int horsePower;

    public Engines(FUEL fuelType, int horsePower) {
        this.fuelType = fuelType;
        this.horsePower = horsePower;
    }

    public FUEL getFuelType() {
        return fuelType;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
