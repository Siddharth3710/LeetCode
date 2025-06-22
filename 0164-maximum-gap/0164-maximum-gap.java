class Solution {
    public int maximumGap(int[] nums) {
      int n=nums.length;
      int cd=0;
      int md=0;
      Arrays.sort(nums);

      for(int i=1;i<nums.length;i++){
         cd=Math.max(cd,nums[i]-nums[i-1]);

         md=Math.max(md,cd);
      }
      return md;
      
    }
}