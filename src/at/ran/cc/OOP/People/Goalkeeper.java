package at.ran.cc.OOP.People;

public class Goalkeeper extends SoccerPlayer{
    private boolean hasGloves;
    public Goalkeeper(String firstName, String lastName, int ageOfPerson, int heightOfPerson, double fortyTime,
                      boolean playsSoccer, boolean hasGloves) {
        super(firstName, lastName, ageOfPerson, heightOfPerson, fortyTime, playsSoccer);
        this.hasGloves = hasGloves;
    }
    public void stopsBall (){
        System.out.println("My job is to stop the ball.");
    }

    public boolean isHasGloves() {
        return hasGloves;
    }

    public void setHasGloves(boolean hasGloves) {
        this.hasGloves = hasGloves;
    }
}
