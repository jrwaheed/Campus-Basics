package at.ran.cc.OOP.Association;

public class Secretaries extends Members{
    private float membershipDiscount;
    public Secretaries(String firstName, String lastName, int lengthOfTenure, String occupation, int membershipFee,
                       float membershipDiscount) {
        super(firstName, lastName, lengthOfTenure, occupation, membershipFee);
        this.membershipDiscount = membershipDiscount;
    }

    public float getMembershipDiscount() {
        return membershipDiscount;
    }

    public void setMembershipDiscount(float membershipDiscount) {
        this.membershipDiscount = membershipDiscount;
    }

    public float getActualMembershipFee(){
        float actualMembershipFee = getMembershipFee() - getMembershipDiscount();
        return actualMembershipFee;
    }

    void importantDuties(){
        System.out.println("I do not take dictation. I am actually important.");
    }
}
