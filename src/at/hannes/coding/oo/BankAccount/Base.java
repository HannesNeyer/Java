package at.hannes.coding.oo.BankAccount;

public class Base
{
    private double deposit;
    private double payOut;
    private double CurrentStatus;

    public Base(double deposit, double payOut, double CurrentStatus) {
        this.deposit = deposit;
        this.payOut = payOut;
        this.CurrentStatus = CurrentStatus;
    }

    public void Depositing(){
        CurrentStatus += deposit;
        System.out.println(CurrentStatus);
    }

    public void PayOut(){

        CurrentStatus -= payOut;
        System.out.println(CurrentStatus);
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getPayOut() {
        return payOut;
    }

    public void setPayOut(double payOut) {
        this.payOut = payOut;
    }

    public double getCurrentStatus() {
        return CurrentStatus;
    }

    public void setCurrentStatus(double currentStatus) {
        CurrentStatus = currentStatus;
    }
}

