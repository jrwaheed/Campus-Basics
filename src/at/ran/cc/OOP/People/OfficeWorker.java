package at.ran.cc.OOP.People;

public class OfficeWorker extends Human {
    private String employmentType;
    public OfficeWorker(String firstName, String lastName, int ageOfPerson, int heightOfPerson, String employmentType) {
        super(firstName, lastName, ageOfPerson, heightOfPerson);
        this.employmentType = employmentType;
    }

    public void filling() {
        System.out.println("I can also do some filling");
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }
}