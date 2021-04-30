package at.ran.cc.OOP.Band_package;

public class Main {
    public static void main(String [] arg){
        Singer singer1 = new Singer("Tom", 32,100000, Singer.TYPE.SOPRANO);
        Backupsinger singer2 = new Backupsinger("Billy", 28, 50000, Singer.TYPE.SOPRANO);
        Bassist bassMan = new Bassist("Roger", 30, 75000, Singer.TYPE.BASS, "Bass");
        Drummer drumWoman = new Drummer("Sandy", 34, 65000, Singer.TYPE.ALTO, "Drum");
        Gitarist gitarWoman = new Gitarist("Rebecca", 27, 70000, Singer.TYPE.SOPRANO, "Gitar");

        System.out.println(singer1.getVoiceType());
        System.out.println(drumWoman.getFirstName());

        singer1.sing();
        singer2.sing();
    }
}
