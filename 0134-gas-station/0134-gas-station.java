class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tg=0;
        int tc=0;
        int str=0;
        int curr=0;
        for(int i=0;i<gas.length;i++){
            tg+=gas[i];
            tc+=cost[i];
            curr+=(gas[i]-cost[i]);
            if(curr<0){
                str=i+1;
                curr=0;
            }
        }
        if(tc>tg){
            return -1;
        }
        return str;
    }
}