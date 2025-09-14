import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int s = m + n;

        double[] nums = new double[s];
        int k = 0;

        for (int i = 0; i < m; i++) {
            nums[k++] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            nums[k++] = nums2[i];
        }

        Arrays.sort(nums);

        if (s % 2 == 0) {
            return (nums[s / 2] + nums[(s / 2) - 1]) / 2.0;
        } else {
            return nums[s / 2];
        }
    }
}