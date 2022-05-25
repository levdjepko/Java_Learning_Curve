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
        //
        Scanner scanner = new Scanner(System.in);


        // 3/6:
        System.out.println("Write how many ml of water the coffee machine has: ");
        int waterAmount = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkAmount = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:  ");
        int coffeeAmount = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int numOfCups = scanner.nextInt();
        final int waterPerCup = 200;
        final int milkPerCup = 50;
        final int coffeePerCup = 15;

        int maximumCupsCanBeCreated = Math.min(waterAmount / waterPerCup, Math.min(milkAmount / milkPerCup, coffeeAmount / coffeePerCup));
        if (maximumCupsCanBeCreated == numOfCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (maximumCupsCanBeCreated > numOfCups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (maximumCupsCanBeCreated - numOfCups) + " more than that)");
        } else {
            System.out.println("No, I can make only " + maximumCupsCanBeCreated + " cup(s) of coffee");
        }
    }
}
