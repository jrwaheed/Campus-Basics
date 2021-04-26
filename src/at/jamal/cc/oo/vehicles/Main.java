package at.jamal.cc.oo.vehicles;

public class Main {

    public static void main(String[] args) {
        Tank tank1 = new Tank(40);

        Engine e1 = new Engine(4   ,2.5, Engine.FUEL.Diesel);
        Engine e2 = new Engine(6,3, Engine.FUEL.Petro);

        Vehicle v1 = new Vehicle(true, 10000, true, e1, tank1);
        Vehicle v2 = new Vehicle(false, 5000, true, e2, tank1);

        //System.out.println(v1.getEngine().getCylinders());

        //e1.setCylinders(5);
        //System.out.println(v1.getEngine().getCylinders());
        System.out.println(v1.getEngine().getFuelType());

        e1.setFuelType(Engine.FUEL.Petro);
        System.out.println(e1.getFuelType());

        v1.drive(40);
        e1.engineRPM(110);
    }
}
