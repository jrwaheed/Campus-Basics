package at.ran.cc.OOP.Handy;

public class Cellphone {
    private String color;
    private SIM sim;
    private Camera camera;
    private Memory SDCard;

    public Cellphone(String color, SIM sim, Camera camera, Memory SDCard) {
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.SDCard = SDCard;
    }

    public void takePicture() {
        System.out.println("SNAP!");
    }

    public void makeCall(String phoneNumber){
        System.out.println("Dialing " + phoneNumber);
        System.out.println("ring ring...");
    }




}

