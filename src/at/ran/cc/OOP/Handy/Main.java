package at.ran.cc.OOP.Handy;

import java.util.List;

public class Main {
    public static SIM sim1 = new SIM(10001, "43 660 712 6564");
    public static Memory memory1 = new Memory(512);
    public static Camera cameraFront = new Camera();
    public static Cellphone Samsung = new Cellphone("black",sim1,cameraFront,memory1);

    public static void takePhoto(String extension, int size, String name, Camera.CAMERARESOLUTION resolution) {
        Samsung.getCamera().shutterClick(resolution);
        Samsung.getCamera().setResolution(resolution);
        Samsung.getMemory().saveFile(new Files(extension,size,name,resolution));
    }

    public static void makeTelephoneCall(String phoneNumber){
        Samsung.getSim().makeCall(phoneNumber);
    }

    public static void clearFiles(){
        Samsung.getMemory().deleteFiles();
    }

    public static void printFiles(){
        Samsung.getMemory().printFiles();
    }


    public static void main(String[] args) {

        takePhoto("jpg",512,"FamilyPhoto", Camera.CAMERARESOLUTION.LOW);
        takePhoto("bmp",128,"Portrait", Camera.CAMERARESOLUTION.MEDIUM);
        takePhoto("raw",4096,"Dog Photo", Camera.CAMERARESOLUTION.HIGH);
        printFiles();
        clearFiles();
        makeTelephoneCall("43 660 712 6222");
    }
}





