package at.hannes.coding.oo.cars;

public class Truck extends Car {
    private String trailer;

    public Truck(String brand, String serialNumber, Tank tank, Engine engine, rear_mirror r1, rear_mirror r2, Tires tires, String trailer) {
        super(brand, serialNumber, tank, engine, r1, r2, tires);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
