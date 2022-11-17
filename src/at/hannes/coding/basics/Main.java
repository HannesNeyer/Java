package at.hannes.coding.basics;

import javax.sql.rowset.FilteredRowSet;

public class car
{
    public static void main()
    {
        First_Object c1 = new First_Object();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "A1234";
        c1.fuelAmount = 70;
        c1.tankvolume = 100;


        First_Object c2 = new First_Object();
        c2.brand = "BMW";
        c2.fuelConsumption = 4;
        c2.serialNumber = "B1234";
        c2.fuelAmount = 20;
        c2.tankvolume = 75;
        System.out.println(c2.fuelAmount);
        c2.drive();
        System.out.println(c2.fuelAmount);
        c2.Break();
        c2.turboBoost();
        c2.honk(5, 0);
        c2.getRemainingRange();



        /*System.out.println(c1.serialNumber);
        System.out.println(c2.serialNumber);
        */
    }
}
