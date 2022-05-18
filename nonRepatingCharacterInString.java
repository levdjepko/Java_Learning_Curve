import java.util.HashSet;
import java.util.Hashtable;

class Scratch {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        nonRepeating("abcab"); // should return 'c'
        nonRepeating("abab"); // should return null
        nonRepeating("aabbbc"); // should return 'c'
        nonRepeating("aabbdbc"); // should return 'd'

        //driver:
        System.out.println(nonRepeating("abcab"));
        System.out.println(nonRepeating("abab"));
        System.out.println(nonRepeating("aabbbc"));
        System.out.println(nonRepeating("aabbdbc"));

    }

    // Implement your solution below.
    public static Character nonRepeating(String s) {
        // declare a hashSet
        Hashtable<Character, Integer> set = new Hashtable<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (!set.containsKey(s.charAt(i))) {
                set.put(s.charAt(i), 1);
            } else {
                int count = set.get(s.charAt(i)) + 1;
                set.put(s.charAt(i), count);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            int value = set.get(s.charAt(i));
            if (value == 1) {
                return s.charAt(i);
            }
        }
        return null;
        /* 
        BELOW IS THE WEIRD VERSION OF THAT THAT DOESN"T USE HASHSET:
        public static int lonelyinteger(List<Integer> a) {
    
        Integer[] sortedArray = new Integer[a.size()];
        sortedArray = a.toArray(sortedArray);
        Arrays.sort(sortedArray);
        System.out.println(Arrays.toString(sortedArray));
        
        int result = 0;
        if (sortedArray.length == 1) {
            return sortedArray[0];
        } else if (sortedArray.length > 2 && sortedArray[0] != sortedArray[1]) {
            return sortedArray[0];
        } else if (sortedArray.length > 2 && sortedArray[sortedArray.length - 1] != sortedArray[sortedArray.length - 2]) {
            return sortedArray[sortedArray.length - 1];
        }
        for (int i = 1; i < sortedArray.length - 1; i++) {
            if (sortedArray[i] != sortedArray[i + 1] && sortedArray[i] != sortedArray[i - 1]) {
                System.out.println(sortedArray[i] + ", " + sortedArray[i + 1] );
                result = sortedArray[i];
            }
        }
        return result;
    }*/
    }
}
