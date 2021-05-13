package at.ran.cc.OOP.Handy;

import java.util.ArrayList;

public class SIM {
    private int IDnumber;
    private String number;
    private ArrayList<String> files;

    public SIM(int IDnumber, String number) {
        this.IDnumber = IDnumber;
        this.number = number;
        this.files = new ArrayList<>();
    }

    public void makeCall(String phoneNumber) {
        System.out.println("Dialing " + phoneNumber);
        System.out.println("ring ring...");
    }
}