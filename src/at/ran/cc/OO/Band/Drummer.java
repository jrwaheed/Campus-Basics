package at.ran.cc.OO.Band;

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
