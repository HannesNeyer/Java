package at.hannes.coding.oo.cars;

import java.util.ArrayList;
import java.util.List;

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

    private String brand;
    private String serialNumber;

    private String color;

    private int tenPercent;

    private Engine engine;
    private Tank tank;

    private List<rear_mirror> mirrors;
    private Tires tires;

    public Car(String brand, String serialNumber, Tank tank, Engine engine, rear_mirror r1, rear_mirror r2, Tires tires){
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.engine = engine;
        this.tank = tank;
        this.mirrors = new ArrayList<>();
        this.tires = tires;
    }

    public void drive(){
        int speed = 0;
        this.engine.setFuelConsumption(this.engine.getKm() * this.engine.getFuelConsumption());
        this.tank.setFuelAmount(this.tank.getFuelAmount() - this.engine.getFuelConsumption());
        speed = this.engine.getKm() * this.engine.getH();
        System.out.println("I am driving at "+speed+" km per hour");
    }

    public void Break()
    {
        System.out.println("I am braking");
    }

    public void turboBoost()
    {
        this.tenPercent = (this.tank.getTankvolume()/100)*10;
        if(this.tank.getFuelAmount() < this.tenPercent)
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
        this.tank.setFuelAmount(this.tank.getFuelAmount()/this.engine.getFuelConsumption());
        System.out.println("Die Reichweite beträgt: " + this.tank.getFuelAmount()+"km");
    }

    public void getRearMirror(rear_mirror rear_mirror){
        this.mirrors.add(rear_mirror);
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public List<rear_mirror> getMirrors() {
        return mirrors;
    }

    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }
}
