class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int idx, int vdx) {
        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long val = (long) nums[i];
            Long x = set.ceiling(val - vdx);

            if (x != null && Math.abs(x - val) <= vdx) {
                return true;
            }

            set.add(val);

            if (i >= idx) {
                set.remove((long) nums[i - idx]);
            }
        }

        return false;
    }
}
