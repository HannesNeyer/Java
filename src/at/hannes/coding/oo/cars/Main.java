package at.hannes.coding.oo.cars;


public class Main
{
    public static void main(String[] args)
    {
        Engine e1 = new Engine (50, Engine.FUEL.Super,0.074,51,1);
        Engine e2 = new Engine (50,Engine.FUEL.Benzin,0.069,29,1);

        Tank t1 = new Tank(50,100);
        Tank t2 = new Tank(75,80);

        rear_mirror r1 = new rear_mirror(75,0);
        rear_mirror r2 = new rear_mirror(98,-40);

        Tires T1 = new Tires(3, Tires.tire_type.SummerTire, 70.3, 70.2);
        Tires T2 = new Tires(4, Tires.tire_type.WinterTire,69.4, 69.5);

        Car c1 = new Car("Audi","123",t1,e1,r1,r2,T1);
        Car c2 = new Car("BMW","B427",t2,e2,r1,r2,T2);

        Truck LKW = new Truck("Mercedes","256",t2,e2,r1,r2,T1,"Container Trailer")

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

