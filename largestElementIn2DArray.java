import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // find the largest element in a 2Dd-array
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        //fill the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        //assume that the first index is the biggest
        int maxValue  = array[0][0];
        int resultN = 0;
        int resultM = 0;
        //iterate over array to find the largest value
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                    resultN = i;
                    resultM = j;
                }
            }
        }
        System.out.println(resultN + " " + resultM);
    }
}
