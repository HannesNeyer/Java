package at.hannes.coding.oo.cars;

public class Tank
{
    private double fuelAmount;
    private int tankvolume;

    public Tank(int fuelAmount, int tankvolume) {
        this.fuelAmount = fuelAmount;
        this.tankvolume = tankvolume;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getTankvolume() {
        return tankvolume;
    }

    public void setTankvolume(int tankvolume) {
        this.tankvolume = tankvolume;
    }
}

