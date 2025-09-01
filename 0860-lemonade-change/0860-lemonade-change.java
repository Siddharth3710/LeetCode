class Solution {
    public boolean lemonadeChange(int[] bills) {
        int curr=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                curr+=5;
            }
            else{
                if(bills[i]+5>curr){
    return false;
}            }
curr+=bills[i];
        }
        return true;
    }
}