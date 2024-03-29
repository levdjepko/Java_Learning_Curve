
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Write a program that reads an unsorted array of integers 
        // and two numbers n and m. The program must check if n and m 
        // occur next to each other in the array (in any order).
        //
        // * Input data format *
        //
        // The first line contains the size of an array.
        // The second line contains elements of the array.
        // The third line contains two integer numbers n and m.
        // All numbers in the same line are separated by the space character.
        
        Scanner scanner = new Scanner(System.in);
        boolean result = false;
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            int element = scanner.nextInt();
            array[i] = element;
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int j = 1; j < size - 1; j++) {
            if (array[j] == n && (array[j+1] == m || array[j-1] == m)){
                result = true;
            }
            if (array[j] == m && (array[j+1] == n || array[j-1] == n)){
                result = true;
            }
        }
        System.out.println(result);
    }
}
