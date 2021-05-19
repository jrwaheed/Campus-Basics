package at.ran.cc.OOP.Autos;

//updated
public class Main {
    public static void main(String[] arg) {


        Manufacturers factory1 = new Manufacturers("Honda", "Japan",
                .02f);
        Manufacturers factory2 = new Manufacturers("Porsche", "Germany",
                .05f);
        Manufacturers factory3 = new Manufacturers("Ford", "USA",
                .04f);

        Engines engine1 = new Engines(Engines.FUEL.GASOLINE, 175);
        Engines engine2 = new Engines(Engines.FUEL.GASOLINE, 175);
        Engines engine3 = new Engines(Engines.FUEL.DIESEL, 300);

        Cars civic = new Cars("Grey", 120, 30000, 5.0, 100000, engine1, factory1);
        Cars carrera = new Cars("Yellow", 170, 90000, 10, 10000, engine2, factory2);
        Cars bronco = new Cars("Green", 100, 40000, 8, 45000, engine3, factory3);


        System.out.println(modelCurrentConsumption(carrera));
        System.out.println(modelDiscount(carrera));

    }
    public static float modelCurrentConsumption(Cars modelName) {
        if (modelName.getKiloMetersTraveled() > 40000) {
            return (float) (modelName.getBaseConsumption() * (1 + .098));
        } else {
            return (float) modelName.getBaseConsumption();
        }
    }

    public static float modelDiscount(Cars modelName) {
        return (float) (modelName.getBasePrice() * (1 - modelName.getManufacturer().getManufacturerDiscount()));
    }
}

