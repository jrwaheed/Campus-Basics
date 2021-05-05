package at.ran.cc.OOP.CarInvoice;

import java.util.HashMap;

public class Engines {





    public enum FUEL {DIESEL, GASOLINE};
    private FUEL fuelType;

    public enum POWER {PS100, PS200}
    private POWER horsePower;

    private float enginePrice;


    public Engines(FUEL fuelType, POWER horsePower) {
        this.fuelType = fuelType;
        this.horsePower = horsePower;
        this.enginePrice = enginePrice;
    }

    public FUEL getFuelType() {
        return fuelType;
    }

    public POWER getHorsePower() {
        return horsePower;
    }

    public void setFuelType(FUEL fuelType) {
        this.fuelType = fuelType;
    }

    public void setHorsePower(POWER horsePower) {
        this.horsePower = horsePower;
    }

}

