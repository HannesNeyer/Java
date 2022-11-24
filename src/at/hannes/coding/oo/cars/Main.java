package at.hannes.coding.oo.cars;
import at.hannes.coding.oo.cars.Engine;

public class Main
{
    public static void main(String[] args)
    {
        Engine e1 = new Engine (50, Engine.FUEL.Super);
        Engine e2 = new Engine (50,Engine.FUEL.Benzin);
        Car c1 = new Car(5,"Audi","123",30,40,e1);
        Car c2 = new Car(7,"BMW","B427",50,75,e2);

        c1.drive();
        c1.Break();
        c1.turboBoost();
        c1.honk(2,0);

        c2.drive();
        c2.Break();
        c2.turboBoost();
        c2.honk(4,0);
    }
}

