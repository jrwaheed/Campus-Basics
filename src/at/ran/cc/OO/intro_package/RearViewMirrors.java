package OO.intro_package;

public class RearViewMirrors {
    public enum POSITION {center, right, left, camera}
    private POSITION mirrorPosition;
    private int mirrorSize;

    public RearViewMirrors(POSITION mirrorPosition, int mirrorSize) {
        this.mirrorPosition = mirrorPosition;
        this.mirrorSize = mirrorSize;
    }

    public POSITION getMirrorPosition() {
        return mirrorPosition;
    }

    public void setMirrorPosition(POSITION mirrorPosition) {
        this.mirrorPosition = mirrorPosition;
    }

    public int getMirrorSize() {
        return mirrorSize;
    }

    public void setMirrorSize(int mirrorSize) {
        this.mirrorSize = mirrorSize;
    }

}
