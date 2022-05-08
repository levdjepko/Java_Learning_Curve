package tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cells: ");
        String input = scanner.next();
        //xo_xo_xo_
        //(_ _ _ _ _ _ _ _ _)
        // now we need a 2D array to get the state of this game:
        char[][] gameState = new char[3][3];
        //fill this array with the values that the user input:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameState[i][j] = input.charAt(i * 3 + j);
            }
        }
        //this just prints out the state of the field:
        outputGameState(gameState);

        int countX = 0;
        int countO = 0;
        int countEmpty = 0;

        //expecting the coordinates from 1 to 3
        System.out.println("Enter the coordinates: ");
        int inputRow = -1;
        int inputColumn = -1;
        boolean coordinatesCorrect = true;
        boolean gameFinished = false;

        while (!gameFinished) {
            try {
                inputRow = scanner.nextInt();
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
                gameState[inputRow - 1][inputColumn - 1] = 'X';
            }
            if (coordinatesCorrect) {
                outputGameState(gameState);
                gameFinished = true;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (input.charAt(i) == 'X') {
                countX++;
            } else if (input.charAt(i) == 'O') {
                countO++;
            } else {
                countEmpty++;
            }
        }
        if (countX - countO > 1 || countO - countX > 1 ||
                (
                        (input.charAt(0) == 'X' && input.charAt(1) == 'X' && input.charAt(2) == 'X' ||
                                input.charAt(3) == 'X' && input.charAt(4) == 'X' && input.charAt(5) == 'X' ||
                                input.charAt(6) == 'X' && input.charAt(7) == 'X' && input.charAt(8) == 'X' ||
                                input.charAt(0) == 'X' && input.charAt(3) == 'X' && input.charAt(6) == 'X' ||
                                input.charAt(1) == 'X' && input.charAt(4) == 'X' && input.charAt(7) == 'X' ||
                                input.charAt(2) == 'X' && input.charAt(5) == 'X' && input.charAt(8) == 'X' ||
                                input.charAt(0) == 'X' && input.charAt(4) == 'X' && input.charAt(8) == 'X' ||
                                input.charAt(2) == 'X' && input.charAt(4) == 'X' && input.charAt(6) == 'X')
                                &&
                                (input.charAt(0) == 'O' && input.charAt(1) == 'O' && input.charAt(2) == 'O' ||
                                        input.charAt(3) == 'O' && input.charAt(4) == 'O' && input.charAt(5) == 'O' ||
                                        input.charAt(6) == 'O' && input.charAt(7) == 'O' && input.charAt(8) == 'O' ||
                                        input.charAt(0) == 'O' && input.charAt(3) == 'O' && input.charAt(6) == 'O' ||
                                        input.charAt(1) == 'O' && input.charAt(4) == 'O' && input.charAt(7) == 'O' ||
                                        input.charAt(2) == 'O' && input.charAt(5) == 'O' && input.charAt(8) == 'O' ||
                                        input.charAt(0) == 'O' && input.charAt(4) == 'O' && input.charAt(8) == 'O' ||
                                        input.charAt(2) == 'O' && input.charAt(4) == 'O' && input.charAt(6) == 'O')
                )
        ) {
            //System.out.println("Impossible");
        } else if (input.charAt(0) == 'X' && input.charAt(1) == 'X' && input.charAt(2) == 'X' ||
                input.charAt(3) == 'X' && input.charAt(4) == 'X' && input.charAt(5) == 'X' ||
                input.charAt(6) == 'X' && input.charAt(7) == 'X' && input.charAt(8) == 'X' ||
                input.charAt(0) == 'X' && input.charAt(3) == 'X' && input.charAt(6) == 'X' ||
                input.charAt(1) == 'X' && input.charAt(4) == 'X' && input.charAt(7) == 'X' ||
                input.charAt(2) == 'X' && input.charAt(5) == 'X' && input.charAt(8) == 'X' ||
                input.charAt(0) == 'X' && input.charAt(4) == 'X' && input.charAt(8) == 'X' ||
                input.charAt(2) == 'X' && input.charAt(4) == 'X' && input.charAt(6) == 'X') {
            //System.out.println("X wins");
        } else if (input.charAt(0) == 'O' && input.charAt(1) == 'O' && input.charAt(2) == 'O' ||
                input.charAt(3) == 'O' && input.charAt(4) == 'O' && input.charAt(5) == 'O' ||
                input.charAt(6) == 'O' && input.charAt(7) == 'O' && input.charAt(8) == 'O' ||
                input.charAt(0) == 'O' && input.charAt(3) == 'O' && input.charAt(6) == 'O' ||
                input.charAt(1) == 'O' && input.charAt(4) == 'O' && input.charAt(7) == 'O' ||
                input.charAt(2) == 'O' && input.charAt(5) == 'O' && input.charAt(8) == 'O' ||
                input.charAt(0) == 'O' && input.charAt(4) == 'O' && input.charAt(8) == 'O' ||
                input.charAt(2) == 'O' && input.charAt(4) == 'O' && input.charAt(6) == 'O') {
            //System.out.println("O wins");
        } else if (countEmpty > 0) {
            //System.out.println("Game not finished");
        } else if (countEmpty == 0) {
            //System.out.println("Draw");
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
