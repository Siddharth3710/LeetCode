import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] result = new int[spells.length];
        Arrays.sort(potions); // Sort potions for binary search

        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];
            int low = 0, high = potions.length - 1;

            // Binary search for the first potion that meets the success condition
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if ((long) spell * potions[mid] >= success) {
                    high = mid - 1; // Move left to find the first valid potion
                } else {
                    low = mid + 1; // Move right
                }
            }

            // Calculate the number of successful pairs
            result[i] = potions.length - low;
        }

        return result;
    }
}
