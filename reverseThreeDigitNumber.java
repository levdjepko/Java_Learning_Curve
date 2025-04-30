import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // this program attempts to reverse the three-digit number
        Scanner scanner = new Scanner(System.in);
        
        int initial = scanner.nextInt();
        int single = initial % 10; // last digit 1
        int decimal = (initial % 100 - single) / 10; // second digit 2
        int hundreds = (initial % 1000 - decimal) / 100; // first digit 3
        // now turn them around:
        int newNumber = single*100 + decimal*10 + hundreds;
        System.out.println(newNumber);
    }
}
