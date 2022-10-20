package Excercises;

import java.io.StringReader;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] gamefield = new char[3][3];
        int row;
        int colume;
        int player = 1;
        int playerInput;
        boolean OutOfRange = true;

        do {
            do {
                row = 0;
                colume = 0;
                playerInput = 0;
                OutOfRange = true;
                Scanner scanner = new Scanner(System.in);

                if (player % 2 == 0) {
                    System.out.println("Your turn player 2 (o)");
                    System.out.println("Player 2, please, type in your row (0,1,2):");
                    playerInput = scanner.nextInt();
                    if(playerInput > -1 & playerInput < 3)
                    {
                        row = playerInput;
                    }
                    else
                    {
                        OutOfRange = false;
                    }
                    System.out.println("Player 2, please type in your colume(0,1,2):");
                    playerInput = scanner.nextInt();
                    if(playerInput > -1 & playerInput < 3)
                    {
                        colume = playerInput;
                    }
                    else
                    {
                        OutOfRange = false;
                    }
                }
                else
                {
                    System.out.println("Your turn player 1 (x)");
                    System.out.println("Player 1, please, type in your row (0,1,2):");
                    playerInput = scanner.nextInt();
                    if(playerInput > -1 & playerInput < 3)
                    {
                        row = playerInput;
                    }
                    else
                    {
                        OutOfRange = false;
                    }

                    System.out.println("Player 1, please type in your colume (0,1,2):");
                    playerInput = scanner.nextInt();
                    if(playerInput > -1 & playerInput < 3)
                    {
                        colume = playerInput;
                    }
                    else
                    {
                        OutOfRange = false;
                    }
                }

                if (gamefield[row][colume] == 0 & OutOfRange == true) {
                    if (player % 2 == 0) {
                        gamefield[row][colume] = 'o';
                    } else {
                        gamefield[row][colume] = 'x';
                    }
                } else {
                    System.out.println("Space is already filled, or a number out of range was used, please try again with a different one");
                    playerInput = -1;
                }
            } while (playerInput == -1); //check if space is already filled, if yes same player gets to try again

            player += 1; //changes player
            arrayoutput(gamefield);

        } while (isThereAWinnerRow(gamefield) == true || isThereAWinnerCol(gamefield) == true);
        System.out.println("Congratulations, you have won");
    }

/*
    public static void runTests() {
        char[][] data = {{'o', 'o', 'o'}, {'o', 'x', 'o'}, {'x', 'x', 'o'}};
        arrayoutput(data);
        boolean result = isThereAWinner(data);
        System.out.println(result);
    }
*/

    public static void arrayoutput(char[][] data) {
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data.length; col++) {
                System.out.print(data[row][col]);
            }
            System.out.println();
        }
    }

    public static boolean isThereAWinnerRow(char[][] data)
    {
        boolean hasWinner = true;
        for (int row = 0; row < data.length; row++)
        {
            for (int col = 0; col < data.length - 1; col++) {
                if (data[row][col] != data[row][col + 1]) {
                    hasWinner = false;
                }
            }
        }
        return hasWinner;
    }

    public static boolean isThereAWinnerCol(char[][] data)
    {
        boolean hasWinner = true;
        for (int col = 0; col < data.length; col++)
        {
            hasWinner = true;
            for (int row = 0; row < data.length -1; row++)
            {
                if(data[col][row] != data[col][row+1])
                {
                    hasWinner = false;
                }
            }

        }
        return hasWinner;
    }
}

