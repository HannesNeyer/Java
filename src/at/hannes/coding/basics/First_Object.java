package at.hannes.coding.basics;

public class First_Object
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

    public int fuelConsumption;
    public String brand;
    public String serialNumber;
    public int fuelAmount;
    private String color;
    public int tankvolume;
    private int tenPercent;

    public First_Object(int fuelConsumption, String brand, String serialNumber){
        this.fuelConsumption = fuelConsumption;
        this.brand = brand;
        this.serialNumber = serialNumber;
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
}
