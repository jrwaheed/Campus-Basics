package at.ran.cc.OOP.remote_package;

public class Batteries {
    public enum TYPE {A, AA, AAA}
    private TYPE capacity;

    public enum CHARGINGSTATUS {CHARGING, FINISHED}
    private CHARGINGSTATUS chargingStatus;

    private double price;


    public Batteries(TYPE capacity, double price, CHARGINGSTATUS chargingStatus) {
        this.capacity = capacity;
        this.price = price;
        this.chargingStatus = chargingStatus;
    }

    public TYPE getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public CHARGINGSTATUS getChargingStatus() {
        return chargingStatus;
    }
}

