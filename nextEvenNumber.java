import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // next Even number after the input number
        int numberInput = scanner.nextInt();
        int nextEven = (numberInput + 1) % 2 == 0 ? (numberInput + 1) : (numberInput + 2);
        System.out.println(nextEven);
    }
}
