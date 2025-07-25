class Solution {
    public int firstMissingPositive(int[] nums) {
 HashSet<Integer> h = new HashSet<>();
        int i=1;

        for(int j=0;j<nums.length;j++){
            h.add(nums[j]);
        }

             while(true){
            if(!h.contains(i)){
                return i;
            }
            i++;
        }
    }
}