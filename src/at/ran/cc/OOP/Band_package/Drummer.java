package at.ran.cc.OOP.Band_package;

public class Drummer extends Singer{
    private String instrument;
    public Drummer(String firstName, int performerAge, int performerSalary, TYPE voiceType, String instrument) {
        super(firstName, performerAge, performerSalary, voiceType);
        this.instrument = instrument;
    }

    public String getInstrument() {
        return instrument;
    }
}
