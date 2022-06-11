import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        // find the longest ascending sequence
        // 1 2 4 1 2 3 5 7 4 3
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];
        // fill the array with the items
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
            //System.out.println(array[i]);
        }
        int left = 0;
        int right = 0;
        int lenAscending = -1;
        // now iterate over array and find the longest ascending sequence
        for (int i = 1; i < length; i++) {
            if (array[i] > array[i-1]) {
                right = i;
                System.out.println("bigger");
            } else {
                if (lenAscending <= right - left) {
                    lenAscending = right - left + 1;
                }
                left = i;
                right = i;
            }
        }
        if (lenAscending <= right - left) {
            lenAscending = right - left + 1;
        }
        System.out.println(lenAscending);
    }
}
