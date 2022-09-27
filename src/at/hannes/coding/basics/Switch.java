package at.hannes.coding.basics;

import java.util.Random;

public class Switch
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int randomNum = random.nextInt(6)+5;
        System.out.println(randomNum);

        switch(randomNum)
        {
            case 10:
            {
                System.out.print("ten");
                break;
            }
            case 9:
            {
                System.out.print("nine");
                break;
            }
            case 8:
            {
                System.out.print("eight");
                break;
            }
            case 7:
            {
                System.out.print("seven");
                break;
            }
            case 6:
            {
                System.out.print("six");
                break;
            }
            case 5:
            {
                System.out.print("five");
                break;
            }
            default:
                System.out.println("fehler");
        }
    }
}
