package at.ran.cc.OOP.People;

public class Athlete extends Human{
    private double fortyTime;
    public Athlete(String firstName, String lastName, int ageOfPerson, int heightOfPerson, double fortyTime) {
        super(firstName, lastName, ageOfPerson, heightOfPerson);
        this.fortyTime = fortyTime;
    }

    public void movement(){
        System.out.println("I move better than your average desk jockie.");
    }

    public double getFortyTime() {
        return fortyTime;
    }

    public void setFortyTime(double fortyTime) {
        this.fortyTime = fortyTime;
    }
}
