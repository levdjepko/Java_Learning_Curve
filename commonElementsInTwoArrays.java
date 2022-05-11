import java.util.*;

class Scratch {
    public static void main(String[] args) {
        // NOTE: The following input values are used for testing your solution.

        int[] array1A = {1, 3, 4, 6, 7, 9};
        int[] array2A = {1, 2, 4, 5, 9, 10};
        // commonElements(array1A, array2A) should return [1, 4, 9] (an array).
        System.out.println(Arrays.toString(commonElements(array1A, array2A)));
        int[] array1B = {1, 2, 9, 10, 11, 12};
        int[] array2B = {0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15};
        // commonElements(array1B, array2B) should return [1, 2, 9, 10, 12] (an array).
        System.out.println(Arrays.toString(commonElements(array1B, array2B)));
        int[] array1C = {0, 1, 2, 3, 4, 5};
        int[] array2C = {6, 7, 8, 9, 10, 11};
        System.out.println(Arrays.toString(commonElements(array1C, array2C)));
        // common_elements(array1C, array2C) should return [] (an empty array).
    }

    // Implement your solution below.
    // NOTE: Remember to return an Integer array, not an int array.
    public static Integer[] commonElements(int[] array1, int[] array2) {

        ArrayList<Integer> resultSet = new ArrayList<Integer>(); // dynamic array
        HashSet<Integer> dict = new HashSet<Integer>(); // hash set
        for (int i = 0; i < array1.length; i++) {
            dict.add(array1[i]); // track all the items inside of one of the arrays
        }
        // then loop over another array and check all the matches
        for (int i = 0; i < array2.length; i++) {
            if(dict.contains(array2[i])) {
                resultSet.add(array2[i]);
            }
        }
        // we have to return an array from the list
        Integer[] resultInArray = new Integer[resultSet.size()];
        resultSet.toArray(resultInArray);
        return resultInArray;
    }
}
