package at.hannes.coding.oo.BankAccount;

public class GiroKonto extends Base
{
    private int limit;

    public GiroKonto(double deposit, double payOut, double CurrentStatus, int limit) {
        super(deposit, payOut, CurrentStatus);
        this.limit = limit;
    }

    @Override
    public void PayOut()
    {
        if ((getCurrentStatus()- getPayOut()) < limit)
        {
            System.out.println("Sorry, you can not pay out more than the limit allows");
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

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
