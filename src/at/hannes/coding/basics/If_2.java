package at.hannes.coding.basics;

import java.util.Random;

public class If_2 {
    public static void main(String[] args) {
        Random random_1 = new Random();
        int randomNum_1 = random_1.nextInt(100);

        Random random_2 = new Random();
        int randomNum_2 = random_2.nextInt(100);

        //System.out.println(randomNum_1);
        //System.out.println(randomNum_2);

        if(randomNum_1 < randomNum_2 & randomNum_1 < 50)
        {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }

        if (randomNum_1 < 30 || randomNum_2 < 30)
        {
            System.out.println("Eine der beiden Zahlen ist kleiner als 30");
        }
        if (randomNum_1 < 50 & randomNum_2 != 50)
        {
            System.out.println("Erste Zahl klein, zweite Zahl keine 50");
        }
    }
}
