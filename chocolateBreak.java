import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //_____________________________________________________________________________
        // Imagine a chocolate bar. Remember how it is usually split into smaller bits by a special grid?
        // Now think of chocolate as an N x M rectangle divided into little segments:
        // N segments in length and M in width. Each segment is 1x1 and unbreakable.
        // Find out whether it is possible to break
        // off exactly K segments from the chocolate with a
        // single straight line: vertical or horizontal.
        //_____________________________________________________________________________________
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();
        /* N vertical chocolate bars
           and M horizontal:
         ____M_____
        N| | | | |
         | | | | |
         | | | | |
        we break the chocolate in one place only , can we get K pieces?
        */
        //we have to "hold" one of the numbers and iterate over the other one to see what different options we get:
        int product = -1;
        boolean foundResult = false;
        for (int i = 1; i < N; i++) {
            product = i * M;
            if (product == K && !foundResult) {
                System.out.println("YES");
                foundResult = true; //yes, we can get the K pieces
            }
        }
        for (int j = 1; j < M; j++) {
            product = j * N;
            if (product == K && !foundResult) {
                System.out.println("YES");
                foundResult = true;//yes, we can get the K pieces
            }
        }
        if (!foundResult){
            System.out.println("NO");
        }
    }
}
