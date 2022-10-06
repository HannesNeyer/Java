package Excercises;

import java.util.Scanner;

public class Bankautaomat
{

    public static void main(String[] args)
    {
        int selection;
        float summ = 0;
        do
        {
            System.out.println("Wilkommen, geben sie ein was sie tun möchten");
            System.out.println("1 für Einzahlen");
            System.out.println("2 für Abheben");
            System.out.println("3 für Kontostand");
            System.out.println("4 für Beenden");

            Scanner scanner = new Scanner(System.in);
            selection = scanner.nextInt();

            switch (selection)
            {
                case 1: {
                    System.out.println("Geben sie ein wieviel sie einzahlen wollen");
                    float einzahlen = scanner.nextFloat();
                    summ += einzahlen;
                    System.out.println("Ihr neuer Kontostand lautet: " + summ);
                    break;
                }
                case 2: {
                    System.out.println("Geben sie ein wieviel sie abheben wollen");
                    float abheben = scanner.nextFloat();
                    summ -= abheben;
                    System.out.println("Ihr neuer Kontostand lautet: " + summ);
                    break;
                }
                case 3:
                {
                    System.out.println("Ihr aktueller Kontostand lautet: " + summ);
                    break;
                }
                case 4:
                {
                    System.out.println("Bitte Karte entnehmen");
                    break;
                }
                default:
                    System.out.println("Bitte wählen sie eine vorhandene Zahl");
            }
        }while(selection != 4);
    }
}
