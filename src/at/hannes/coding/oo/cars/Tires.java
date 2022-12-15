package at.hannes.coding.oo.cars;

public class Tires
{
    private int count_tires;
    public enum tire_type{SummerTire, WinterTire}
    private tire_type TIRES;
    private double tire_width;
    private double tire_hight;

    public Tires(int count_tires, tire_type TIRES, double tire_width, double tire_hight){
        this.count_tires = count_tires;
        this.TIRES = TIRES;
        this.tire_width = tire_width;
        this.tire_hight = tire_hight;
    }

    public int getCount_tires() {
        return count_tires;
    }

    public tire_type getTIRES() {
        return TIRES;
    }

    public double getTire_width() {
        return tire_width;
    }

    public double getTire_hight() {
        return tire_hight;
    }
}
