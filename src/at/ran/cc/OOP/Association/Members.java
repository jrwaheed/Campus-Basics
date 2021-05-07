package at.ran.cc.OOP.Association;

public class Members {
    private String firstName;
    private String lastName;
    private int lengthOfTenure;
    private String occupation;
    private float membershipFee;

    public Members(String firstName, String lastName, int lengthOfTenure, String occupation, float membershipFee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lengthOfTenure = lengthOfTenure;
        this.occupation = occupation;
        this.membershipFee = membershipFee;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getLengthOfTenure() {
        return lengthOfTenure;
    }

    public void setLengthOfTenure(int lengthOfTenure) {
        this.lengthOfTenure = lengthOfTenure;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public float getMembershipFee() {
        return membershipFee;
    }

    public void setMembershipFee(int membershipFee) {
        this.membershipFee = membershipFee;
    }

}

