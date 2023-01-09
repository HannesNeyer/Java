package at.hannes.coding.oo.TV_remote;

public class Battery_2
{
    private double chargingStatus_2;
    private int batteryInserted_2;

    public Battery_2(double chargingStatus_2, int batteryInserted_2){
        this.chargingStatus_2 = chargingStatus_2;
        this.batteryInserted_2 = batteryInserted_2;
    }

    public double getChargingStatus_2() {
        return chargingStatus_2;
    }

    public void setChargingStatus_2(double chargingStatus_2) {
        this.chargingStatus_2 = chargingStatus_2;
    }

    public int getBatteryInserted_2() {
        return batteryInserted_2;
    }

    public void setBatteryInserted_2(int batteryInserted_2) {
        this.batteryInserted_2 = batteryInserted_2;
    }
}
