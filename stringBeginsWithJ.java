import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String input = scanner.next();
        char x = input.charAt(0);
        x = Character.toUpperCase(x);
        if (x == 'J') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
