class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<Integer> pick = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean used[]=new boolean[candidates.length];
        Arrays.sort(candidates);


        backtrack(candidates, target, used, pick, ans, 0);        return ans;
    }
    static void backtrack(int[] arr,int target,boolean used[], List<Integer> pick,List<List<Integer>> ans,int idx){
        if(target==0){
            ans.add(new ArrayList<>(pick));
            return;
        }
         if (target < 0) return;


         for(int i=idx;i<arr.length;i++){
            if(i > 0 && arr[i] == arr[i - 1] && !used[i - 1])continue;
            if(used[i])continue;

            //choise 1 include hoja combination me
            used[i]=true;
            pick.add(arr[i]);

            //recursive function;
            backtrack(arr,target-arr[i],used,pick,ans,i+1);


            //choice 2 mood  to nahi aunga 

            pick.remove(pick.size()-1);
            used[i]=false;
         }


    }
}