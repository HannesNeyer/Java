package at.hannes.coding.oo.Calculator;
import java.util.Scanner;

public class Standard_Calculator
{
    public Standard_Calculator() {
    }

    public int selection(){
        int selection = 0;
        System.out.println("What do you want to do?");
        System.out.println("1 sum up, 2 subtract, 3 multiply, 4 divide");
        Scanner input = new Scanner(System.in);
        selection = input.nextInt();
        return selection;
    }

    public double calculation()
    {
        double num1 = 0;
        double num2 = 0;
        double result = 0;
        int confirmation = 1;

        switch(selection())
        {
            case 1:
            {

                System.out.println("Please typ in the numbers you want to be summerized");
                do
                {
                    Scanner addition = new Scanner(System.in);
                    num1 = addition.nextDouble();
                    num2 = addition.nextDouble();

                    num1 += num2;
                    result += num1;

                    System.out.println("Wollen sie noch eine weitere adition hinzufügen falls ja eine 1 eingeben sonste eine 0");
                    Scanner YesNo = new Scanner(System.in);
                    confirmation = YesNo.nextInt();

                }while(confirmation == 1);
            }

            case 2:
            {
                System.out.println("Please typ in the numbers you want to be subtracted");
                do
                {
                    Scanner subtraction = new Scanner(System.in);
                    num1 = subtraction.nextDouble();
                    num2 = subtraction.nextDouble();

                    num1 -= num2;
                    result += num1;

                    System.out.println("Wollen sie noch eine weitere subtraktion hinzufügen falls ja eine 1 eingeben sonste eine 0");
                    Scanner YesNo = new Scanner(System.in);
                    confirmation = YesNo.nextInt();

                }while(confirmation == 1);
            }

            case 3:
            {
                System.out.println("Please typ in the numbers you want to be multiplyed");
                do
                {
                    Scanner multiplication = new Scanner(System.in);
                    num1 = multiplication.nextDouble();
                    num2 = multiplication.nextDouble();

                    num1 *= num2;
                    result += num1;

                    System.out.println("Wollen sie noch eine weitere muliplikation hinzufügen falls ja eine 1 eingeben sonste eine 0");
                    Scanner YesNo = new Scanner(System.in);
                    confirmation = YesNo.nextInt();

                }while(confirmation == 1);
            }

            case 4:
            {
                System.out.println("Please typ in the numbers you want to be divided");
                do
                {
                    Scanner multiplication = new Scanner(System.in);
                    num1 = multiplication.nextDouble();
                    num2 = multiplication.nextDouble();

                    num1 /= num2;
                    result += num1;

                    System.out.println("Wollen sie noch eine weitere division hinzufügen falls ja eine 1 eingeben sonste eine 0");
                    Scanner YesNo = new Scanner(System.in);
                    confirmation = YesNo.nextInt();

                }while(confirmation == 1);
            }
        }
        return result;
    }
}
