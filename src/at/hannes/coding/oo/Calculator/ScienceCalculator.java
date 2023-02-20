package at.hannes.coding.oo.Calculator;

public class ScienceCalculator extends StandardCaluclator
{

    public ScienceCalculator(double num1, double num2) {
        super(num1, num2);
    }

    public void Sin()
    {
        System.out.println(Math.sin(getNum1()));
        System.out.println(Math.sin(getNum2()));
    }

    public void Cos()
    {
        System.out.println(Math.cos(getNum1()));
        System.out.println(Math.cos(getNum2()));
    }
}


