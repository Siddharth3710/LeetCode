class Solution {
    public int[] findErrorNums(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // Build the frequency map
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Find the duplicate number
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) > 1) {
                a.add(nums[i]); // Add the duplicate number
                break; // Only one duplicate exists, so break
            }
        }

        // Find the missing number
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                a.add(i); // Add the missing number
                break;
            }
        }

        // Convert ArrayList to array
        int temp[] = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            temp[i] = a.get(i);
        }

        return temp;
    }
}
