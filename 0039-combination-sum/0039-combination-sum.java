class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> pick = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        temp(candidates,target,pick,ans,0);
        return ans;
    }
    static void temp(int[] candidates,int target, List<Integer> pick,List<List<Integer>> ans,int i){
        if(target==0){
            ans.add(new ArrayList<>(pick));
            return;
        }
        if(i==candidates.length||target<0) return;
        
        pick.add(candidates[i]);
        temp(candidates,target-candidates[i],pick,ans,i);
        pick.remove(pick.size()-1);
        temp(candidates,target,pick,ans,i+1);
    }
}