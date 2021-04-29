package at.ran.cc.OO.Band;

public class Bassist extends Singer {
    private String instrument;

    public Bassist(String firstName, int performerAge, int performerSalary, TYPE voiceType, String instrument) {
        super(firstName, performerAge, performerSalary, voiceType);
        this.instrument = instrument;
    }

    public String getInstrument() {
        return instrument;
    }

}
