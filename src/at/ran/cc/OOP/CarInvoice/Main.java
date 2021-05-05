package at.ran.cc.OOP.CarInvoice;


import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {

    public static Engines engine1 = new Engines(Engines.FUEL.DIESEL, Engines.POWER.PS100);

    public static Cars car1 = new Cars("Grey", "Honda", 5, engine1, 20000);


    public static void main(String [] arg) throws IOException {
        HashMap<Engines.FUEL, Integer> fuelPrice = new HashMap<>();
        fuelPrice.put(Engines.FUEL.DIESEL, 7000);
        fuelPrice.put(Engines.FUEL.GASOLINE, 5000);

        HashMap<Engines.POWER, Integer> powerPrice = new HashMap<>();
        powerPrice.put(Engines.POWER.PS100, 2000);
        powerPrice.put(Engines.POWER.PS200, 4000);



        userFuelSelection();
        userHorsePowerSelection();

        float selectionEnginePrice = fuelPrice.get(car1.getCarEngine().getFuelType()) + powerPrice.get(car1.getCarEngine().getHorsePower());
        float carFullPrice = selectionEnginePrice + car1.getBasePrice();

        String myPath = "C:\\Users\\DCV\\Desktop\\CarInvoice.txt";

        File CarInvoiceObj = new File(myPath);
        CarInvoiceObj.createNewFile();


        FileWriter myWriter = new FileWriter(CarInvoiceObj);
        myWriter.write("Brand\t\t\t|Fuel Type\t\t|Horsepower\t\t|Price  \n");
        myWriter.write(car1.getCarBrand() + "\t\t\t");
        myWriter.write(car1.getCarEngine().getFuelType() + "\t\t\t");
        myWriter.write(car1.getCarEngine().getHorsePower() + "\t\t\t");
        myWriter.write(carFullPrice + "");
        myWriter.close();

    }

    public static void userFuelSelection(){
        System.out.println("Choose the engine fuel type. \nType 1 for Diesel or 2 for gasoline.");
        Scanner fuelObj = new Scanner(System.in);
        int fuelChoice = fuelObj.nextInt();

        switch (fuelChoice) {
            case 1:
                car1.getCarEngine().setFuelType(Engines.FUEL.DIESEL);
                break;

            case 2:
                car1.getCarEngine().setFuelType(Engines.FUEL.GASOLINE);
                break;

            default:
                System.out.println("Invalid entry");

        }
    }

    public static void userHorsePowerSelection(){
        System.out.println("Choose the engine horsepower. \nType 1 for 100PS or 2 for 200PS.");
        Scanner powerObj = new Scanner(System.in);
        int powerChoice = powerObj.nextInt();

        switch (powerChoice) {
            case 1:
                car1.getCarEngine().setHorsePower(Engines.POWER.PS100);
                break;

            case 2:
                car1.getCarEngine().setHorsePower(Engines.POWER.PS200);
                break;

            default:
                System.out.println("Invalid entry.");



        }
    }





}
