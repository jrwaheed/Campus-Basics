package at.ran.cc.OOP.Handy;

public class Main {
    public static SIM sim1 = new SIM(1001, "SQ1NDER4");
    public static Memory memory1 = new Memory(512);
    public static Camera cameraFront = new Camera();
    public static Cellphone Samsung = new Cellphone("black",sim1,cameraFront,memory1);

    public static void main(String[] args) {

        takePhoto("jpg",512,"FamilyPhoto", Camera.CAMERARESOLUTION.HIGH);
        takePhoto("bmp",128,"Portrait", Camera.CAMERARESOLUTION.MEDIUM);
        takePhoto("raw",4000,"Dog Photo", Camera.CAMERARESOLUTION.LOW);
        System.out.println(Samsung.getMemory().getFiles().get(2).getExtension());
        System.out.println(Samsung.getMemory().getFiles().get(1).getSize());
        System.out.println(Samsung.getMemory().getFiles().get(2).getName());
        System.out.println(Samsung.getMemory().getFiles().get(1).getTimeStamp());
        System.out.println(Samsung.getCamera().getResolution());
    }

    public static void takePhoto(String extension, int size, String name, Camera.CAMERARESOLUTION resolution) {
            Samsung.getCamera().shutterClick(resolution);
            Samsung.getCamera().setResolution(resolution);
            Samsung.getMemory().saveFile(new Files(extension,size,name,resolution));

        }

    }


      //  Samsung.getMemory().saveFile(new Files(extension,size,name));
    //}




