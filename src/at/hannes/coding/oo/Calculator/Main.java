package at.hannes.coding.oo.Calculator;

public class Main
{
    public static void main(String[] args)
    {
        StandardCaluclator SC1 = new StandardCaluclator(5.32, 4.93);
        SC1.division();
        SC1.subtraction();
        SC1.addition();
        SC1.multiplication();

        ScienceCalculator SC2 = new ScienceCalculator(3,6.22);
        SC2.division();
        SC2.subtraction();
        SC2.addition();
        SC2.multiplication();
        SC2.Cos();
        SC2.Sin();

        SquareRootCalculator SC3 = new SquareRootCalculator(9.7,3);
        SC3.division();
        SC3.subtraction();
        SC3.addition();
        SC3.multiplication();
        SC3.squareRoot();
    }
}
