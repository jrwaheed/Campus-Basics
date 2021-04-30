package OO.intro_package;

public class Main {

    public static void main(String[] args) {

        Tires tire1 = new Tires(Tires.QUALITY.high, 15 , 50);
        Tires tire2 = new Tires(Tires.QUALITY.low, 10 , 30);
        Tires tire3 = new Tires(Tires.QUALITY.high, 20 , 30);
        Tires tire4 = new Tires(Tires.QUALITY.medium, 10 , 60);

        RearViewMirrors mirror1 = new RearViewMirrors(RearViewMirrors.POSITION.left, 10);
        RearViewMirrors mirror2 = new RearViewMirrors(RearViewMirrors.POSITION.camera, 50);

        Tank tank1 = new Tank(40);

        Engine e1 = new Engine(4, 2.5, Engine.FUEL.Diesel);
        Engine e2 = new Engine(6, 3, Engine.FUEL.Petro);

        Vehicle v1 = new Vehicle(true, 10000, true, e1, tank1);
        Vehicle v2 = new Vehicle(false, 5000, true, e2, tank1);

        v1.addMirror(mirror1);
        v1.addMirror(mirror2);
        System.out.println(v1.getRearViewMirrors().get(0).getMirrorSize());
        //System.out.println(v1.getEngine().getCylinders());

        //e1.setCylinders(5);
        //System.out.println(v1.getEngine().getCylinders());
        System.out.println(v1.getEngine().getFuelType());

        e1.setFuelType(Engine.FUEL.Petro);
        System.out.println(e1.getFuelType());

        v1.drive(40);
        e1.engineRPM(110);

        v1.addTire(tire1);
        v1.addTire(tire2);
        v1.addTire(tire3);
        v1.addTire(tire4);

        System.out.println(v1.getRearViewMirrors().get(1).getMirrorPosition());
        System.out.println(v1.getRearViewMirrors().get(0).getMirrorPosition());

        System.out.println(v1.getTires().get(0).getInnerDiameter());

        //System.out.println(v1.getTires().get(0).getRubberQuality());
        //System.out.println(v1.getTires().get(1).getRubberQuality());
        //System.out.println(v1.getTires().get(3).getOutDiameter());

    }
}
