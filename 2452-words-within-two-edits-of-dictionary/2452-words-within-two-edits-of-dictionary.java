class Solution {
    public List<String> twoEditWords(String[] q, String[] d) {
        ArrayList<String> al = new ArrayList<>();
        for(int i = 0; i < q.length; i++){
            for(int j = 0; j < d.length; j++){
                if(check(q[i], d[j])) {
                    al.add(q[i]);
                    break;
                }
            }
        }
        return al;
    }
    private Boolean check(String s1, String s2){
        int diff = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                diff++;
                if(diff > 2) return false;
            }
        }
        return true;
    }
}