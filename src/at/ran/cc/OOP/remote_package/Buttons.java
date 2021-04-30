package OO.remote_package;

public class Buttons {
    public enum FORM {SQUARE, CIRCLE, TRIANGLE}
    private FORM shape;
    private String color;
    private String text;

    public Buttons (FORM shape, String color, String text) {
        this.shape = shape;
        this.color = color;
        this.text = text;
    }

    public FORM getShape() {
        return shape;
    }

    public String getColor() {
        return color;
    }

    public String getText() {
        return text;
    }
}
