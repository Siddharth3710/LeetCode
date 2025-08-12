class Solution {
    public String predictPartyVictory(String senate) {
        int n=senate.length();
        Queue<Integer>r=new ArrayDeque<>();
        Queue<Integer>d=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='R')r.add(i);
               else d.add(i);
        }
     

        while(!r.isEmpty() && !d.isEmpty()){
            int ridx=r.poll();
            int didx=d.poll();
            if(ridx>didx){
                d.add(ridx+n);
            }
            else{
             r.add(didx+n);
            }
        }

        return r.isEmpty()?"Dire":"Radiant";

    }
}