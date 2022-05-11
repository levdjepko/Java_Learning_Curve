import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

public class scratch_4 {
    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};
        System.out.println(mostFrequent(array1));
        System.out.println(mostFrequent(array2));
        //System.out.println(mostFrequent(array3));
        //System.out.println(mostFrequent(array4));
        //System.out.println(mostFrequent(array5));

    }

    // Implement your solution below.
    public static Integer mostFrequent(int[] givenArray) {
        Integer maxItem = null;
        int maxCountSoFar = 0;
        //ALSO USE EDGE CASES FOR 0 and 1
        // use hashtable instead:
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        //loop through every item in the array and keep track of them in a hashtable:
        for (int i = 0; i < givenArray.length; i++) {
            // hashTable already has this key:
            if (map.containsKey(givenArray[i])) {
                int currentCount = map.get(givenArray[i]);
                currentCount++;
                map.put(givenArray[i], currentCount);
                if (currentCount > maxCountSoFar) {
                    maxCountSoFar = currentCount;
                    maxItem = givenArray[i];
                }
            } else {
                //hashTable doesn't contain this Key, yet
                map.put(givenArray[i], 1);
            }
        }

        return maxItem;
    }
}
