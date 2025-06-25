import java.util.Arrays;

class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        Arrays.sort(nums1);  // Ensure both arrays are sorted
        Arrays.sort(nums2);

        long low = -1_000_000_000L * 1_000_000_000L;
        long high = 1_000_000_000L * 1_000_000_000L;
        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long count = countProductsLessEqual(nums1, nums2, mid);

            if (count >= k) {
                ans = mid;
                high = mid - 1;  // Try for smaller value
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private long countProductsLessEqual(int[] nums1, int[] nums2, long x) {
        long count = 0;
        for (int a : nums1) {
            if (a == 0) {
                if (x >= 0) count += nums2.length;  // 0 * b = 0, which is ≤ x if x ≥ 0
            } else if (a > 0) {
                // Find max index such that b ≤ x / a
                int l = 0, r = nums2.length - 1;
                while (l <= r) {
                    int m = (l + r) / 2;
                    if ((long) a * nums2[m] <= x) {
                        l = m + 1;
                    } else {
                        r = m - 1;
                    }
                }
                count += l;
            } else { // a < 0
                // Find min index such that b ≥ ceil(x / a)
                int l = 0, r = nums2.length - 1;
                while (l <= r) {
                    int m = (l + r) / 2;
                    if ((long) a * nums2[m] <= x) {
                        r = m - 1;
                    } else {
                        l = m + 1;
                    }
                }
                count += nums2.length - r - 1;
            }
        }
        return count;
    }
}
