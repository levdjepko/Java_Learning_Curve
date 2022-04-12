import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Sample Input:
        // Eugene
        // 8
        // fusion
        String name = scanner.nextLine();
        String experience = scanner.nextLine();
        String cuisine = scanner.nextLine();
        System.out.println("The form for " + name + " is completed. " +
                "We will contact you if we need" +
                " a chef who cooks " +
                cuisine +
                " dishes and has " +
                experience +
                " years of experience.");
    }
}
