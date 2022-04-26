package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cells: ");
        String input = scanner.next();
        //xo_xo_xo_
        char[] cells = new char[9];
        //(_ _ _ _ _ _ _ _ _)
        for (int i = 0; i < input.length(); i++) {
            cells[i] = input.charAt(i);
        }
        System.out.println("---------");
        System.out.print("| " + cells[0] + " " + cells[1] + " " + cells[2]+ " ");
        System.out.println("|");
        System.out.print("| " + cells[3] + " " + cells[4] + " " + cells[5]+ " ");
        System.out.println("|");
        System.out.print("| " + cells[6] + " " + cells[7] + " " + cells[8]+ " ");
        System.out.println("|");
        System.out.println("---------");

    }
}
