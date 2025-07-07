class Solution {
    public int findLucky(int[] arr) {
         HashMap<Integer,Integer>hm=new HashMap<>();
         int ans=-1;
         for(int num:arr){
            hm.put(num,hm.getOrDefault(num,0)+1);
         }
         for(int i=0;i<arr.length;i++){
            int freq=hm.get(arr[i]);

            if(freq==arr[i]){
               ans = Math.max(ans, arr[i]);
            }
         }
         return ans;

    }
}