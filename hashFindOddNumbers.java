
import java.util.HashMap;


class Solution {
    public int solution(int[] A) {
        // hash sets in java
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            if (!seen.containsKey(A[i])) {
                seen.put(A[i], 1);
            }
            else if (seen.containsKey(A[i])) {
                if (seen.get(A[i]) == 1){
                    seen.replace(A[i], 0);
                }
            }
        }
        for (int i = 0; i < A.length; i++){
            if (seen.get(A[i]) == 1){
                return A[i];
            }
        }
        return 0;
    }
}
