package at.ran.cc.OOP.remote_package;

//in progress
import java.util.ArrayList;
import java.util.List;

public class Remote {
    private int length = 200;
    private int height;
    private int width;
    private List<Batteries> battery;
    private List<Buttons> button;

    public enum TVSTATUS {ON, OFF}
    private TVSTATUS isOn;

    private boolean hasPower;

    public Remote(int length, int height, int width, TVSTATUS isOn, Boolean hasPower) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.battery = new ArrayList<>();
        this.button = new ArrayList<>();
        this.isOn = isOn;
        this.hasPower = hasPower;
    }

    public List<Buttons> getButtons(){
        return button;
    }
    public void addButton(Buttons button) {
        this.button.add(button);
    }

    public List<Batteries> getBattery(){
        return battery;
    }
    public void addBattery(Batteries battery) {
        this.battery.add(battery);
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public TVSTATUS getIsOn() {
        return isOn;
    }

    public void setIsOn(TVSTATUS isOn) {
        this.isOn = isOn;
    }

    public boolean isHasPower() {
        return hasPower;
    }

}
