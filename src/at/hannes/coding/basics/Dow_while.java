package at.hannes.coding.basics;

import java.util.Random;

public class Dow_while
{
    public static void main(String[] args)
    {
        int RandomNum = 0;
        int summ = 0;

        do
        {
            Random random = new Random();
            int randomNumber = random.nextInt(30)+11;
            summ += randomNumber;
            RandomNum = randomNumber;


        }while(RandomNum != 15 && RandomNum != 25);
        System.out.println(summ);
    }
}
