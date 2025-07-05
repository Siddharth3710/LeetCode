class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
           List<List<Integer>>res=new ArrayList<>();
       boolean []used=new boolean[nums.length];
       Arrays.sort(nums);

       backtrack(nums,new ArrayList<>(),used,res);
       return res;
    }
     private void backtrack(int arr[],List<Integer>path,boolean used[], List<List<Integer>>res){
         if(path.size()==arr.length){
            res.add(new ArrayList<>(path));
            return ;
        }
         for(int i=0;i<arr.length;i++){
            if(used[i])continue;
            if(i>0 && arr[i]==arr[i-1] && !used[i-1])continue;



             //choose
        used[i]=true;
        path.add(arr[i]);

        //backtrack and explore
        backtrack(arr,path,used,res);

        //remove
        path.remove(path.size()-1);
                used[i]=false;

         }

     }
}