import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // compare two strings, removing all the whitespace
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        first = first.replaceAll("\\s+", "");
        second = second.replaceAll("\\s+", "");
                
        if (first.equals(second)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
