package at.ran.cc.OOP.People;

public class OfficeWorker extends Human {
    public OfficeWorker(String firstName, String lastName, int ageOfPerson, int heightOfPerson) {
        super(firstName, lastName, ageOfPerson, heightOfPerson);
    }

    public void filling() {
        System.out.println("I can also do some filling");
    }


}