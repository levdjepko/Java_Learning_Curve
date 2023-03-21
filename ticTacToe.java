package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //output the initial state of the field (empty):
        char[][] gameState = new char[3][3];
        Arrays.fill(gameState[0], '_');
        Arrays.fill(gameState[1], '_');
        Arrays.fill(gameState[2], '_');
        outputGameState(gameState);

        int countX = 0;
        int countO = 0;
        int countEmpty = 0;

        //expecting the coordinates from 1 to 3

        int inputRow = -1;
        int inputColumn = -1;
        int currentPlayer = 1;
        boolean coordinatesCorrect = true;
        boolean gameFinished = false;

        while (!gameFinished) {
            System.out.println("Enter the coordinates: ");
            System.out.print("Current player: ");
            if (currentPlayer == 1){
                System.out.println("X");
            } else {
                System.out.println("O");
            }
            try {
                System.out.print("row: ");
                inputRow = scanner.nextInt();
                System.out.print("column: ");
                inputColumn = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
                continue;
            }

            if ((inputRow < 1 || inputRow > 3 || inputColumn < 1 || inputColumn > 3) && coordinatesCorrect) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }
            //looks like it works, now check the cell
            if (coordinatesCorrect && gameState[inputRow - 1][inputColumn - 1] != '_') {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            } else if (coordinatesCorrect) {
                if (currentPlayer == 1) {
                    gameState[inputRow - 1][inputColumn - 1] = 'X';
                    currentPlayer = 2;
                }
                else {
                    gameState[inputRow - 1][inputColumn - 1] = 'O';
                    currentPlayer = 1;
                }
            }
            if (coordinatesCorrect) {
                outputGameState(gameState);
            }
            // here comes the check of the game state (x wins, o wins, draw):
            countX = 0;
            countO = 0;
            countEmpty = 0;
            for (int row = 0; row < 3; row++) {
                for (int column = 0; column < 3; column++) {
                    if (gameState[row][column] == 'X') {
                        countX++;
                    } else if (gameState[row][column] == 'O') {
                        countO++;
                    } else {
                        countEmpty++;
                    }
                }
            }
            if (gameState[0][0] == 'X' && gameState[0][1] == 'X' && gameState[0][2] == 'X' ||
                    gameState[1][0] == 'X' && gameState[1][1] == 'X' && gameState[1][2] == 'X' ||
                    gameState[2][0] == 'X' && gameState[2][1] == 'X' && gameState[2][2] == 'X' ||
                    gameState[0][0] == 'X' && gameState[1][0] == 'X' && gameState[2][0] == 'X' ||
                    gameState[0][1] == 'X' && gameState[1][1] == 'X' && gameState[2][1] == 'X' ||
                    gameState[0][2] == 'X' && gameState[1][2] == 'X' && gameState[2][2] == 'X' ||
                    gameState[0][0] == 'X' && gameState[1][1] == 'X' && gameState[2][2] == 'X' ||
                    gameState[2][0] == 'X' && gameState[1][1] == 'X' && gameState[0][2] == 'X') {
                System.out.println("X wins");
                gameFinished = true;
            }
            else if (gameState[0][0] == 'O' && gameState[0][1] == 'O' && gameState[0][2] == 'O' ||
                    gameState[1][0] == 'O' && gameState[1][1] == 'O' && gameState[1][2] == 'O' ||
                    gameState[2][0] == 'O' && gameState[2][1] == 'O' && gameState[2][2] == 'O' ||
                    gameState[0][0] == 'O' && gameState[1][0] == 'O' && gameState[2][0] == 'O' ||
                    gameState[0][1] == 'O' && gameState[1][1] == 'O' && gameState[2][1] == 'O' ||
                    gameState[0][2] == 'O' && gameState[1][2] == 'O' && gameState[2][2] == 'O' ||
                    gameState[0][0] == 'O' && gameState[1][1] == 'O' && gameState[2][2] == 'O' ||
                    gameState[2][0] == 'O' && gameState[1][1] == 'O' && gameState[0][2] == 'O') {
                System.out.println("O wins");
                gameFinished = true;
            }
            else if (countEmpty == 0) {
                System.out.println("Draw");
                gameFinished = true;
            }
        }

    }


    private static void outputGameState(char[][] gameState) {
        System.out.println("---------");
        System.out.print("| " + gameState[0][0] + " " + gameState[0][1] + " " + gameState[0][2] + " ");
        System.out.println("|");
        System.out.print("| " + gameState[1][0] + " " + gameState[1][1] + " " + gameState[1][2] + " ");
        System.out.println("|");
        System.out.print("| " + gameState[2][0] + " " + gameState[2][1] + " " + gameState[2][2] + " ");
        System.out.println("|");
        System.out.println("---------");
    }
}
