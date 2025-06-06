import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // The little app to estimate the investment portfolio performance over time.
        // It is assumed that the return rate is default 7% per year
        Scanner in = new Scanner(System.in);

        System.out.print("Type in the amount of the initial investment: ");
        double initialAmount = in.nextDouble();

        System.out.print("Type in the amount of the additional monthly investment: ");
        double additionalAmount = in.nextDouble();

        System.out.print("Type in the number of years for this investments: ");
        int numberOfMonths = in.nextInt() * 12;

        double endAmount = initialAmount;

        for (int i = 1; i < numberOfMonths; i++) {
            endAmount += endAmount * 7 / 100 / 12; // add the amount of interest for 1 month based on 7% rate (S&P 500)
            endAmount += additionalAmount;
        }
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Over " + numberOfMonths + " months, your initial portfolio of " +
                        initialAmount + " will grow to " + df.format(endAmount) + " if you keep adding " + additionalAmount
        + " every month");
        double monthlyAmount = endAmount * 0.04 / 12;
        System.out.println("Monthly amount is: " + df.format(monthlyAmount));
    }
}
