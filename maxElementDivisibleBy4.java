import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // You are given a sequence of natural numbers,
        // not exceeding 30000. Find the maximum element
        // divisible by 4. As input, the program gets the
        // number of elements in the sequence, and then
        // the elements themselves. In the sequence, there
        // is always an element divisible by 4. The number
        // of elements does not exceed 1000.
        // The program should print a single number:
        // the maximum element of the sequence divisible by 4.
        
        Scanner scanner = new Scanner(System.in);
        
        int totalNumbers = scanner.nextInt();
        int currentElement = 0;
        int max = -1;
        
        while(currentElement < totalNumbers){
            int element = scanner.nextInt();
            if (element % 4 == 0 && element >= max){
                max = element;
            }
            currentElement++;
        }
        System.out.println(max);
    }
}
