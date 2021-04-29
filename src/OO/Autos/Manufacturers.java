package OO.Autos;

public class Manufacturers {

    private String manufacturerName;
    private String manufacturerCountry;
    private float manufacturerDiscount;

    public Manufacturers(String manufacturerName, String manufacturerCountry, float manufacturerDiscount) {
        this.manufacturerName = manufacturerName;
        this.manufacturerCountry = manufacturerCountry;
        this.manufacturerDiscount = manufacturerDiscount;
    }


    public String getManufacturerName() {
        return manufacturerName;
    }

    public String getManufacturerCountry() {
        return manufacturerCountry;
    }

    public double getManufacturerDiscount() {
        return manufacturerDiscount;
    }
}


