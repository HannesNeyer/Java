package at.hannes.coding.oo.BankAccount;

public class Kreditkonto extends Base
{
    private double intrest = 0.0;

    public Kreditkonto(double deposit, double payOut, double CurrentStatus, double intrest) {
        super(deposit, payOut, CurrentStatus);
        this.intrest = intrest;
    }

    public Kreditkonto(double deposit, double payOut, double CurrentStatus) {
        super(deposit, payOut, CurrentStatus);
    }

    @Override
    public void Depositing() {
        if ((getCurrentStatus()+ getDeposit()) < 0)
        {
            System.out.println("Sorry, you can not deposit more than your credited");
            System.out.println("You´re current crddit is: "+getCurrentStatus());
            System.out.println();
        }
        else
        {
            setCurrentStatus(getCurrentStatus()-getPayOut());
            System.out.println("The transaction was succesfull");
            System.out.println("You´re current crddit is: "+getCurrentStatus());
            System.out.println();
        }
    }

    public void intrestRate(){
        System.out.println("You´re current intrest rate is :" + intrest);
        System.out.println();
    }

    public double getIntrest() {
        return intrest;
    }

    public void setIntrest(double intrest) {
        this.intrest = intrest;
    }
}
