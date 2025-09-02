class Solution {
    public boolean lemonadeChange(int[] bill) {
        int five=0;
        int ten=0;
        for(int i=0;i<bill.length;i++){
            if(bill[i]==5){
                five++;
            }
            else if(bill[i]==10){
                if(five==0)return false;
                five--;
                ten++;
            }
            else{
                if(five>=1 && ten>=1){
                    five--;
                    ten--;
                }
                else if(five>=3){
                    five=five-3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}