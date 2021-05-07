package at.ran.cc.OOP.People;

public class Striker extends Goalkeeper{
    public Striker(String firstName, String lastName, int ageOfPerson, int heightOfPerson, double fortyTime,
                   boolean playsSoccer, boolean hasGloves) {
        super(firstName, lastName, ageOfPerson, heightOfPerson, fortyTime, playsSoccer, hasGloves);
    }

    public void kicksBall() {
        System.out.println("i kick the ball hard!");
    }


}
