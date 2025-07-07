class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>res=new ArrayList<>();
        List<String>a=new ArrayList<>();

       

        backtrack(s,0,a,res);
        return res;
    }

    private  void backtrack(String s,int str,List<String>path,List<List<String>>res){
        if(str==s.length()){
            res.add(new  ArrayList<>(path));
            return;
        }

        for(int end=str+1;end<=s.length();end++){

            if(isPalindrome(s,str,end-1)){
            path.add(s.substring(str, end));

            backtrack(s,end,path,res);


            path.remove(path.size()-1);
            }
        }

    }

    private boolean  isPalindrome(String s,int l,int r){

        while(l<=r){
            if(s.charAt(l++)!=s.charAt(r--)){
                return false;
            }
        }

        return true;
    }
}