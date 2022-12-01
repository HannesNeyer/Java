package at.hannes.coding.oo.cars;

public class Engine
{
    private int horsepower;
    public enum FUEL {Diesel, Benzin, Super}
    private FUEL fueltype;
    private double fuelConsumption;
    private int km;
    private int h;

    public Engine(int horsepower, FUEL fueltype, double fuelConsumption, int km, int h) {
        this.horsepower = horsepower;
        this.fueltype = fueltype;
        this.fuelConsumption = fuelConsumption;
        this.km = km;
        this.h = h;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public FUEL getFueltype() {
        return fueltype;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getKm() {
        return km;
    }

    public int getH() {
        return h;
    }
}
