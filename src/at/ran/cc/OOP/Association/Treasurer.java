package at.ran.cc.OOP.Association;

public class Treasurer extends Secretaries{

    public Treasurer(String firstName, String lastName, int lengthOfTenure, String occupation, int membershipFee, float membershipDiscount) {
        super(firstName, lastName, lengthOfTenure, occupation, membershipFee, membershipDiscount);
    }

    @Override
    public void importantDuties(){
        System.out.println("I keep track of all the money. Maybe pocket some.");
    }
}
