package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {        

        // part 4/6:
        Scanner scanner = new Scanner(System.in);
        // Initial amount of ingredients:
        int waterAmount = 400;
        int milkAmount = 540;
        int coffeeAmount = 120;
        int numOfCups = 9;
        int money = 550;

        printRemainingAmounts(waterAmount, milkAmount, coffeeAmount, numOfCups, money);

        // action:
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.next();
        if (action.equals("buy")) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
            int typeOfCoffeePurchased = scanner.nextInt();
            if (typeOfCoffeePurchased == 1) {
                //espresso
                waterAmount -= 250;
                coffeeAmount -= 16;
                numOfCups--;
                money += 4;
            } else if (typeOfCoffeePurchased == 2) {
                // latte
                waterAmount -= 350;
                milkAmount -= 75;
                coffeeAmount -= 20;
                numOfCups--;
                money += 7;
            } else if (typeOfCoffeePurchased == 3) {
                // cappucino
                waterAmount -= 200;
                milkAmount -= 100;
                coffeeAmount -= 12;
                numOfCups--;
                money += 6;
            }

            printRemainingAmounts(waterAmount, milkAmount, coffeeAmount, numOfCups, money);

        } else if (action.equals("fill")) {
            System.out.println("Write how many ml of water you want to add: ");
            waterAmount += scanner.nextInt();
            System.out.println("Write how many ml of milk you want to add: ");
            milkAmount += scanner.nextInt();
            System.out.println("Write how many grams of coffee beans you want to add: ");
            coffeeAmount += scanner.nextInt();
            System.out.println("Write how many disposable cups of coffee you want to add:");
            numOfCups += scanner.nextInt();

            printRemainingAmounts(waterAmount, milkAmount, coffeeAmount, numOfCups, money);

        } else if (action.equals("take")) {
            System.out.println("I gave you $" + money);
            money = 0;

            printRemainingAmounts(waterAmount, milkAmount, coffeeAmount, numOfCups, money);

        }

    }

    private static void printRemainingAmounts(int waterAmount, int milkAmount, int coffeeAmount, int numOfCups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(waterAmount + " ml of water");
        System.out.println(milkAmount + " ml of milk");
        System.out.println(coffeeAmount + " g of coffee beans");
        System.out.println(numOfCups + " disposable cups");
        System.out.println("$" + money + " of money");
    }
}






