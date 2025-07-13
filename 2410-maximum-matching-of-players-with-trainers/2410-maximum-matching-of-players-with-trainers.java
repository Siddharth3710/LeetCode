class Solution {
    public int matchPlayersAndTrainers(int[] p, int[] t) {
         Arrays.sort(p);
        Arrays.sort(t);
        int i=0;
        int j=0;
        int tr=0;

        while(i<p.length && j<t.length){
            if(p[i]<=t[j]){
                tr++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }

        return tr;
    }
}