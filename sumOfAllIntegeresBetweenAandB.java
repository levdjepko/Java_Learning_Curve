import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = 0;
        for (int i = num1; i <= num2; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
