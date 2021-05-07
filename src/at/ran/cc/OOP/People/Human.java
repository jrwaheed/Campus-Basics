package at.ran.cc.OOP.People;

public class Human {
   private String firstName;
   private String lastName;
   private int ageOfPerson;
   private int heightOfPerson;

    public Human(String firstName, String lastName, int ageOfPerson, int heightOfPerson) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ageOfPerson = ageOfPerson;
        this.heightOfPerson = heightOfPerson;
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

    public int getAgeOfPerson() {
        return ageOfPerson;
    }

    public void setAgeOfPerson(int ageOfPerson) {
        this.ageOfPerson = ageOfPerson;
    }

    public int getHeightOfPerson() {
        return heightOfPerson;
    }

    public void setHeightOfPerson(int heightOfPerson) {
        this.heightOfPerson = heightOfPerson;
    }
}

