package at.hannes.coding.oo.BankAccount;

public class Main
{
    public static void main(String[] args)
    {
        Sparbuch sp1 = new Sparbuch(0,1300,1200);
        sp1.Status();
        sp1.Depositing();
        sp1.PayOut();

        Sparbuch sp2 = new Sparbuch(500,2,1200);
        sp2.Status();
        sp2.Depositing();
        sp2.PayOut();

        GiroKonto gk1 = new GiroKonto(500,251,750,750);
        gk1.Status();
        gk1.Depositing();
        gk1.PayOut();

        GiroKonto gk2 = new GiroKonto(0,350,750,0);
        gk2.Status();
        gk2.Depositing();
        gk2.PayOut();

        Kreditkonto kk1 = new Kreditkonto(400,0,-399,0.035);
        kk1.Status();
        kk1.Depositing();
        kk1.PayOut();

        Kreditkonto kk2 = new Kreditkonto(400,200,-800,0.035);
        kk2.Status();
        kk2.Depositing();
        kk2.PayOut();
    }
}
