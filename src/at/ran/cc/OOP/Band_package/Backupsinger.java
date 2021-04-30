package at.ran.cc.OOP.Band_package;

public class Backupsinger extends Singer {

    public Backupsinger(String firstName, int performerAge, int performerSalary, TYPE voiceType) {
        super(firstName, performerAge, performerSalary, voiceType);
    }

    @Override
    public void sing() {
        //super.sing();
        System.out.println("oooooooooo. I sing even better!");
    }
}
