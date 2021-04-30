package at.ran.cc.OOP.intro_OO;

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
