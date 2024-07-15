import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long firstNumber = Long.parseLong(scanner.next());
        String operation = scanner.next();
        long secondNumber = Long.parseLong(scanner.next());

        switch (operation) {
            case "+": {
                System.out.println(firstNumber + secondNumber);
                break;
            }
            case "-": {
                System.out.println(firstNumber - secondNumber);
                break;
            }
            case "/": {
                if (secondNumber != 0) {
                    System.out.println(firstNumber / secondNumber);
                    break;
                }
                else {
                    System.out.println("Division by 0!");
                    break;
                }
            }
            case "*": {
                System.out.println(firstNumber * secondNumber);
                break;
            }
            default: {
                System.out.println("Unknown operator");
                break;
            }
        }
    }
}
