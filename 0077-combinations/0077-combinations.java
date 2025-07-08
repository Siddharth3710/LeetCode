class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>path=new ArrayList<>();

        backtrack(n,k,1,path,res);
        return res;

    }
    private static void backtrack(int n,int k,int idx,List<Integer>path, List<List<Integer>>res){

        if(k==path.size()){
            res.add(new  ArrayList<>(path));
            return;
        }

        for(int i=idx;i<=n;i++){
            path.add(i);
            backtrack(n,k,i+1,path,res);
            path.remove(path.size()-1);
        }
    }
}