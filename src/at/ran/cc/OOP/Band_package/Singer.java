package at.ran.cc.OOP.Band_package;

public class Singer {
    private String firstName;
    private int performerAge;
    private int performerSalary;
    public enum TYPE {SOPRANO, ALTO, TENOR, BASS}
    private TYPE voiceType;

    public Singer (String firstName, int performerAge, int performerSalary, TYPE voiceType) {
        this.firstName = firstName;
        this.performerAge = performerAge;
        this.performerSalary = performerSalary;
        this.voiceType = voiceType;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getPerformerAge() {
        return performerAge;
    }

    public int getPerformerSalary() {
        return performerSalary;
    }

    public TYPE getVoiceType() {
        return voiceType;
    }

    public void sing() {
        System.out.println("lalalalalalala. i sing welll!");
    }

}
