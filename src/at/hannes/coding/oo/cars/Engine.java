package at.hannes.coding.oo.cars;

public class Engine
{
    private int horsepower;
    public enum FUEL {Diesel, Benzin, Super}
    private FUEL fueltype;

    public Engine(int horsepower, FUEL fueltype) {
        this.horsepower = horsepower;
        this.fueltype = fueltype;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public FUEL getFueltype() {
        return fueltype;
    }
}
