package at.hannes.coding.oo.TV_remote;

public class Battery
{
    private double chargingStatus;
    private boolean batteryInserted;

    public Battery(double chargingStatus,boolean batteryInserted){
        this.chargingStatus = chargingStatus;
        this.batteryInserted = batteryInserted;
    }

    public double getChargingStatus() {
        return chargingStatus;
    }

    public void setChargingStatus(double chargingStatus) {
        this.chargingStatus = chargingStatus;
    }

    public boolean getBatteryInserted() {
        return batteryInserted;
    }

    public void setBatteryInserted(boolean batteryInserted) {
        this.batteryInserted = batteryInserted;
    }
}
