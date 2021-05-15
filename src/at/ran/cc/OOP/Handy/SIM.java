package at.ran.cc.OOP.Handy;

import java.util.ArrayList;

public class SIM {
    private int IDnumber;
    private String number;


    public SIM(int IDnumber, String number) {
        this.IDnumber = IDnumber;
        this.number = number;

    }

    public void makeCall(String phoneNumber) {
        System.out.println("Dialing " + phoneNumber);
        System.out.println("ring... ring...\n");
        System.out.println("Hallo?");
    }
}