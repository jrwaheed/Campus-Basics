package at.ran.cc.OOP.Handy;

public class Camera {
    public enum CAMERARESOLUTION {LOW, MEDIUM, HIGH}
    private CAMERARESOLUTION resolution;


    public Camera() {
        this.resolution = resolution;
    }

    public void setResolution(CAMERARESOLUTION resolution) {
        this.resolution = resolution;
    }

    public CAMERARESOLUTION getResolution() {
        return resolution;
    }

    public void shutterClick(CAMERARESOLUTION resolution){
        System.out.println("SNAP..");


    }
}
