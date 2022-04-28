import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();
        int totalCount = 0;
        boolean stopped = false;
        if(number == 1) {
            System.out.println("1");
        }

        for(int i = 1; i < number && !stopped; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
                totalCount++;
                if(totalCount < number) {

                } else {
                    //System.out.print(" total count " + totalCount);
                    stopped = true;
                    break;
                }
            }
        }
    }
}
