package at.hannes.coding.oo.cars;

public class Car
{
   /*
    int a = 7;
    String name = "hans";

    String[] names = {"hans","sepp","paul"};

    int Car1FuelConsumption = 7;
    String Car1Brand = "Audi";
    String Car1SerialNumber = "A1234";

    String[] cars = {"7","Audi","A1234","5","BMW","B1234"};
    */

    private int fuelConsumption;
    private String brand;
    private String serialNumber;
    private int fuelAmount;
    private String color;
    private int tankvolume;
    private int tenPercent;

    private Engine engine;

    public Car(int fuelConsumption, String brand, String serialNumber, int fuelAmount, int tankvolume, Engine engine){
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.tankvolume = tankvolume;
        this.engine = engine;
    }

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

    public void Break()
    {
        System.out.println("I am braking");
    }

    public void turboBoost()
    {
        this.tenPercent = (this.tankvolume/100)*10;
        if(this.fuelAmount < this.tenPercent)
        {
            System.out.println("tankvolume low");
        }
        else
        {
            System.out.println("superboost mode available");
        }
    }

    public void honk(int amountOfRepetitions, int rounds)
    {
        System.out.println("honk");
        rounds = rounds + 1;
        while(amountOfRepetitions == rounds);
    }

    public void getRemainingRange()
    {
        this.fuelAmount = this. fuelAmount / this.fuelConsumption;
        System.out.println("Die Reichweite beträgt: " + this.fuelAmount +"km");
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTankvolume() {
        return tankvolume;
    }

    public void setTankvolume(int tankvolume) {
        this.tankvolume = tankvolume;
    }

    public int getTenPercent() {
        return tenPercent;
    }

    public void setTenPercent(int tenPercent) {
        this.tenPercent = tenPercent;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
