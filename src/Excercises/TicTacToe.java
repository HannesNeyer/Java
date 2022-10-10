package Excercises;

import java.util.Scanner;

public class TicTacToe
{
    public static void main(String[] args)
    {
        char[][] gamefield = new char[3][3];
        int row;
        int colume;
        int player = 0;
        int playerInput;

        do {
            do {
                row = 0;
                colume = 0;
                playerInput = 0;
                Scanner scanner = new Scanner(System.in);

                if (player % 2 == 0) {
                    System.out.println("Player 1, please, type in your row");
                    playerInput = scanner.nextInt();
                    row = playerInput;

                    System.out.println("Player 1, please type in your colume");
                    playerInput = scanner.nextInt();
                    colume = playerInput;
                } else {
                    System.out.println("Player 2, please, type in your row");
                    playerInput = scanner.nextInt();
                    row = playerInput;

                    System.out.println("Player 2, please type in your colume");
                    playerInput = scanner.nextInt();
                    colume = playerInput;
                }

                if (gamefield[row][colume] == 0) {
                    if (player % 2 == 0)
                    {
                        gamefield[row][colume] = 'x';
                    }
                    else
                    {
                        gamefield[row][colume] = 'o';
                    }
                }
                else
                {
                    System.out.println("Space is already filled, please try again with a different one");
                    playerInput = -1;
                }
            } while (playerInput == -1);
            System.out.println(gamefield);
            player += 1;
        }while();
    }
}
