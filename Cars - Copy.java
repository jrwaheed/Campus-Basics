public class Cars {

    // Objektvariablern GEDÄCHTNIS
    public double fuelCapacity;
    public double fuelConsumption;
    public boolean isLuxury;
    public String vehicleBrand;
    public String color = "white"; // Note that in the memory, the color white is used.
    public int price;
    public  double currentFuelLevel;


    public Cars(String color){
        this.color = color;       //With the constructor and 'this' we ensuring that the color
                                  //used is the color from the object. Note the difference in color of the word 'color'.
    }




    public static void main(String [] args) {
        Cars car1 = new Cars("green"); // But here, within the Object we give it a different color
        car1.vehicleBrand = "Jaguar";
        car1.fuelCapacity = 50;
        car1.fuelConsumption = 6;
        car1.isLuxury = true;
        car1.currentFuelLevel = 2;

        Cars car3 = new Cars("red"); // And here a different color.

        System.out.println(car1.color);
        System.out.println(car3.color);

    }

}
