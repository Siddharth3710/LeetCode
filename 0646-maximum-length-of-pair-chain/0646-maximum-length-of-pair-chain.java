import java.util.*;

class Solution {
    public int findLongestChain(int[][] pairs) {
        // Sort pairs by second element
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        
        int count = 0;
        int currentEnd = Integer.MIN_VALUE;
        
        for (int[] pair : pairs) {
            if (pair[0] > currentEnd) { // can extend chain
                count++;
                currentEnd = pair[1];
            }
        }
        
        return count;
    }
}
