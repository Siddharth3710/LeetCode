class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
                if (k <= 1) return 0; // edge case

        int pro=1;
        int l=0;
        int cnt=0;

        for(int i=0;i<nums.length;i++){
            pro*=nums[i];

            while(pro>=k && l<=i){
                pro/=nums[l];
                l++;
            }
            cnt+=i-l+1;
        }

        
        return cnt;
    }
}