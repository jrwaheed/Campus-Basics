package at.ran.cc.OOP.Association;

public class BoardofDirectors extends Secretaries{

    public BoardofDirectors(String firstName, String lastName, int lengthOfTenure, String occupation, int membershipFee, float membershipDiscount) {
        super(firstName, lastName, lengthOfTenure, occupation, membershipFee, membershipDiscount);
    }

    @Override
    public void importantDuties(){
        System.out.println("To tell you the truth, I really dont do anything. I just boss people around and drink coffee.");
    }
}