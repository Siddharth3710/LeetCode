class Solution {
    public List<String> letterCombinations(String str) {
         List<String> ans = new ArrayList<>();

        if (str == null || str.isEmpty()) {
            return ans;
        }

        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        backtrack(str, 0, new StringBuilder(), ans, map);
        return ans;
    }
    private static void backtrack(String str,int idx,StringBuilder sb,List<String>ans,Map<Character, String> map){
        if(sb.length()==str.length()){
            ans.add(sb.toString());
            return ;
        }

        String s=map.get(str.charAt(idx));

        for(char  ch:s.toCharArray()){

            sb.append(ch);
            backtrack(str,idx+1,sb,ans,map);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}