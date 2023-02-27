package at.hannes.coding.oo.BankAccount;

public class Sparbuch extends Base
{
    public Sparbuch(double deposit, double payOut, double CurrentStatus) {
        super(deposit, payOut, CurrentStatus);
    }

    @Override
    public void PayOut()
    {
        if ((getCurrentStatus()- getPayOut()) < 0)
        {
            System.out.println("Sorry, you can not pay out more than there is");
            System.out.println("Current balance sheet after this transaction: "+getCurrentStatus());
            System.out.println();
        }
        else
        {
            setCurrentStatus(getCurrentStatus()-getPayOut());
            System.out.println("The transaction was succesfull");
            System.out.println("Current balance sheet after this transaction: "+getCurrentStatus());
            System.out.println();
        }
    }
}
