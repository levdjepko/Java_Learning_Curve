package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {        
       /* System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!"); */
        System.out.println("Write how many cups of coffee you will need: ");
        Scanner scanner = new Scanner(System.in);

        int numOfCups = scanner.nextInt();
        System.out.println("For " + numOfCups + " cups of coffee you will need:");
        System.out.println(numOfCups * 200 + " ml of water");
        System.out.println(numOfCups * 50 + " ml of milk");
        System.out.println(numOfCups * 15 + " g of coffee beans");
    }
}
