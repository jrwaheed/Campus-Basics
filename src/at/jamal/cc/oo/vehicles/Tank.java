package at.jamal.cc.oo.vehicles;

public class Tank {
    public int getCapacity() {
        return capacity;
    }
    public Tank(int capacity) {
        this.capacity = capacity;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private int capacity = 40;
}
