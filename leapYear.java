import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /* Find whether the given year is a leap year.
        Just a reminder: leap years are those years in which the
        year’s number is either divisible by 4, but not divisible by 100,
        or divisible by 400 (for example, the year 2000 is a leap year,
        but the year 2100 will not be a leap year).
        The program should work correctly for the years 1900 ≤ n ≤ 3000.
        Output "Leap" (case-sensitive) if the given year is a leap year, and "Regular" otherwise.*/
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}
