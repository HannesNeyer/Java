package at.hannes.coding.basics;

public class Main
{
    public static void main(String[] args)
    {
        First_Object c1 = new First_Object();
        c1.setBrand(brand: "Audi");
        c1.setfuelConsumption(fuelConsumption: 7);
        c1.setserialNumber(serialNumber: "A1234");
        c1.setfuelAmount(fuelAmount: 70);
        c1.settankvolume(tankvolume: 100);


        First_Object c2 = new First_Object();
        c2.setBrand(brand: "BMW");
        c2.setfuelConsumption(fuelConsumption: 4);
        c2.setserialNumber(serialNumber: "B1234");
        c2.setfuelAmount(fuelAmount: 20);
        c2.settankvolume(tankvolume: 75);

        System.out.println(c2.setfuelAmount);
        c2.drive();
        System.out.println(c2.setfuelAmount);
        c2.Break();
        c2.turboBoost();
        c2.honk(5, 0);
        c2.getRemainingRange();

        First_Object c3 = new First_Object(17, "Opel", "12340");
        System.out.println(c3.setSerialnumber(serialNumber "12340"));

        /*System.out.println(c1.serialNumber);
        System.out.println(c2.serialNumber);
        */

    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setSerialnumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public void setfuelConsumption(int fuelConsumption){
        this.fuelConsumption = fuelConsumption;
    }

    public void setfuelAmount(int fuelAmount){
        this.fuelAmount = fuelAmount;
    }

    public void settankvolume(int tankvolume){
        this.tankvolume = tankvolume;
    }

    public String getserialNumber {
        return serialNumber;
    }

    public String gettankvolume {
    return tankvolume;

    public String getfuelAmount {
        return fuelAmount;
    }

    public String getfuelConsumption {
        return fuelConsumption;
    }

    public String getbrand {
        return brand;
    }
}
}
