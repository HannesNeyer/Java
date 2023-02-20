package at.hannes.coding.oo.Calculator;

public class SquareRootCalculator extends StandardCaluclator
{
    public SquareRootCalculator(double num1, double num2) {
        super(num1, num2);
    }

    public void squareRoot()
    {
        System.out.println(Math.sqrt(getNum1()));
        System.out.println(Math.sqrt(getNum2()));
    }
}
