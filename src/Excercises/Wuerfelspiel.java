package Excercises;

import java.util.Random;

public class Wuerfelspiel
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int sumPlayer = 0;
        int sumCOM = 0;

        for (int i = 1; i < 7; i++)
        {
            int randomNum = random.nextInt(6);
            System.out.println("You´re " + i + " throw is: " + randomNum);
            sumPlayer += randomNum;
        }

        System.out.println("------------------------------------------");

        for (int i = 1; i < 7; i++)
        {
            int randomNum = random.nextInt(6);
            System.out.println("The computers " + i + " turn: " + randomNum);
            sumCOM += randomNum;
        }

        System.out.println("------------------------------------------");

        if(sumCOM < sumPlayer)
        {
            System.out.println("Congratulations, You´re Winner"); //It´s a joke not a typo
            System.out.println("Your result is: "+sumPlayer);
            System.out.println("The computers result is: "+sumCOM);
        }
        else
        {
            System.out.println("The Computer has won");
            System.out.println("Your result is: "+sumPlayer);
            System.out.println("The computers result is: "+sumCOM);
        }
    }
}
