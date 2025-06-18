class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i += 3) {
            if(nums[i + 2] - nums[i] > k) {
                return new int[0][0]; 
            }
        }
        
        int[][] result = new int[nums.length / 3][3];
        int groupIndex = 0;
        
        for(int i = 0; i < nums.length; i += 3) {
            result[groupIndex][0] = nums[i];
            result[groupIndex][1] = nums[i + 1]; 
            result[groupIndex][2] = nums[i + 2];
            groupIndex++;
        }
        
        return result;
    }
}