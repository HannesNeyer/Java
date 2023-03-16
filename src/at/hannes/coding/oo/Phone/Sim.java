package at.hannes.coding.oo.Phone;

public class Sim {

    private int SimID;
    private String PhoneNumber;

    public Sim(int simID, String phoneNumber) {
        SimID = simID;
        PhoneNumber = phoneNumber;
    }

    public void MakeCall(String PhoneNumber){
        System.out.println("Calling: " + PhoneNumber);
    }

    public int getSimID() {return SimID;}

    public String getPhoneNumber() {
        return PhoneNumber;
    }
}
