package at.hannes.coding.oo.TV_remote;

public class Remote
{
    private double combinedChargingStatus;

    private Battery b1;
    private Battery b2;


    public Remote(Battery b1, Battery b2){
        this.b1 = b1;    this.b2 = b2;
    }

    public void getStatus(){        combinedChargingStatus = ((b1.getChargingStatus() + b2.getChargingStatus())/2);
        System.out.println("current battery status: " + combinedChargingStatus);
    }

    public void turnOn(){
        b1.setChargingStatus((b1.getChargingStatus()/100)*95);
        b2.setChargingStatus((b2.getChargingStatus()/100)*95);
        System.out.println("Verbraucher angeschlossen (Battery 1)" + b1.getChargingStatus());
        System.out.println("Verbraucher angeschlossen (Battery 2)" + b2.getChargingStatus());
    }

    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen (Battery 1)");
        System.out.println("Kein Verbraucher angeschlossen (Battery 2)");
    }

    public double getCombinedChargingStatus() {
        return combinedChargingStatus;
    }

    public void setCombinedChargingStatus(double combinedChargingStatus) {
        this.combinedChargingStatus = combinedChargingStatus;
    }

    public Battery getB1() {
        return b1;
    }

    public void setB1(Battery b1) {
        this.b1 = b1;
    }

    public Battery getB2() {
        return b2;
    }

    public void setB2(Battery b2) {
        this.b2 = b2;
    }
}
