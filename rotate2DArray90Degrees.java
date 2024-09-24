import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        // Given a rectangle array n×m in size.
        // Rotate it by 90 degrees clockwise,
        // by recording the result into the
        // new array m×n in size.
        // Sample Input:
        
        // 3 4
        // 11 12 13 14
        // 21 22 23 24
        // 31 32 33 34
        // Sample Output:        
        // 31 21 11 
        // 32 22 12 
        // 33 23 13 
        // 34 24 14
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] initialArray = new int[n][m]; // 3 x 4
        int[][] rotatedArray = new int[m][n]; // 4 x 3

        //fill the initial 2D array:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                initialArray[i][j] = scanner.nextInt();
            }
        }
        // now we iterate over the array and fill the new one, but rotated:
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                rotatedArray[j][n - i - 1] = initialArray[i][j];// < - rotation is here
            }
        }
        // Next is just to print out all the elements:
        for (int i = 0; i < rotatedArray.length; i++) {
            for (int j = 0; j < rotatedArray[i].length; j++) {
                System.out.print(Integer.toString(rotatedArray[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
