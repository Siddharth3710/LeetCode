import java.util.*;

class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        ArrayList<Long> products = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                long product = (long) nums1[i] * (long) nums2[j];
                products.add(product);
            }
        }

        Collections.sort(products);

        return products.get((int)(k - 1)); // k is 1-based
    }
}
