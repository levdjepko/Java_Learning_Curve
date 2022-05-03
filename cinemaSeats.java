import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // The cinema has n rows, each row consists of m seats (n and m do not exceed 20).
        // A two-dimensional matrix stores the information on the sold tickets:
        // the number 1 means that the ticket for this place is already sold,
        // and the number 0 means that the place is available.
        // You want to buy k tickets to neighboring seats in the same row.
        // Find whether it can be done.
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        //array to hold the seats' availability
        int[][] seatsInCinema = new int[n][m];

        //fill the array with available seats
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                seatsInCinema[i][j] = scanner.nextInt();
            }
        }
        int requiredSeats = scanner.nextInt();
        //we need ^ this many seats in one row
        //now iterate over every row and see if we can find seats
        int haveSeats = 0;
        int foundRow = -1;
        for (int i = 0; i < n && foundRow < 0; i++) {
            haveSeats = 0; // new row -> new seats
            for (int j = 0; j < m; j++) {
                if (seatsInCinema[i][j] == 0) {
                    haveSeats++;
                    if (haveSeats == requiredSeats) {
                        foundRow = i + 1; //zero-based array, BUT 1-based number of rows and seats
                        break;
                    }
                } else {
                    haveSeats = 0;
                } 
            }
        }
        if (foundRow > 0) {
            System.out.println(foundRow);
        } else {
            System.out.println("0");
        }
    }
}
