package at.ran.cc.OOP.Band;

public class Main {
    public static void main(String [] arg){
        Singer singer1 = new Singer("Tom", 32,100000, Singer.TYPE.SOPRANO);

        System.out.println(singer1.getVoiceType());
    }
}
