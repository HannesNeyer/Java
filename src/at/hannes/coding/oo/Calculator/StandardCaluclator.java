package at.hannes.coding.oo.Calculator;
import java.util.Scanner;

public class StandardCaluclator
{
    private double num1;
    private double num2;
    public StandardCaluclator(double num1, double num2)
    {
       this.num1 = num1;
       this.num2 = num2;
    }

    public void addition()
    {
        System.out.println(num1 + num2);
    }

    public void subtraction()
    {
        System.out.println(num1 - num2);
    }

    public void multiplication()
    {
        System.out.println(num1 * num2);
    }

    public void division()
    {
        System.out.println(num1/num2);
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}