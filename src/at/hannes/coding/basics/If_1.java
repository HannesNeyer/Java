package at.hannes.coding.basics;

import java.util.Random;

public class If_1
{
    public static void main(String[] args)
    {
        Random random = new Random();

        int randomNumber = random.nextInt(100);

        if(randomNumber < 20)
        {
            System.out.println("mini");
        }
        else if(randomNumber > 19 & randomNumber < 51)
        {
            System.out.println("medium");
        }
        else
        {
            System.out.println("large");
        }
    }
}
