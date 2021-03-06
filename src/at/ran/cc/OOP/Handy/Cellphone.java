package at.ran.cc.OOP.Handy;

public class Cellphone {
    private String color;
    private SIM sim;
    private Camera camera;
    private Memory memory;

    public Cellphone(String color, SIM sim, Camera camera, Memory memory) {
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.memory = memory;
    }

    public Camera getCamera() {
        return camera;
    }

    public Memory getMemory() {
        return memory;
    }

    public SIM getSim() {
        return sim;
    }
}

