import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;

class Scratch {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6}; // INITIAL ARRAY
        int K = 5; // ROTATE TO THE RIGHT HOW MANY TIMES (shift right)

        int[] newArr = new int[A.length];
        Arrays.fill(newArr, 0);
        System.out.println(Arrays.toString(newArr));

        for (int i = 0; i < K; i++) {
            newArr[0] = A[A.length - 1]; // last index shifts to the first position
            System.out.println("New first index: " + newArr[0]);
            System.out.println(Arrays.toString(newArr));
            for (int index = A.length - 1; index > 0; index--){
                // now, we move the rest of the elements one position to the right
                newArr[index] = A[index - 1];
                System.out.println("Index at " + index + " is: " + A[index-1]);
                System.out.println(Arrays.toString(newArr));
                System.out.println(Arrays.toString(newArr));
            }
            for (int x = 0; x < A.length; x++) {
                A[x] = newArr[x];
             }
        }


    }
}
