package at.hannes.coding.oo.cars;
import at.hannes.coding.oo.cars.Engine;
import at.hannes.coding.oo.cars.Tank;


public class Main
{
    public static void main(String[] args)
    {
        Engine e1 = new Engine (50, Engine.FUEL.Super,0.074,51,1);
        Engine e2 = new Engine (50,Engine.FUEL.Benzin,0.069,29,1);
        Tank t1 = new Tank(50,100);
        Tank t2 = new Tank(75,80);
        Car c1 = new Car("Audi","123",t1,e1);
        Car c2 = new Car("BMW","B427",t2,e2);

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

