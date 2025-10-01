class Solution {
    public int numWaterBottles(int a, int b) {
        int total=a;
       while(a>=b){
        int newBottles = a / b;  
            int remaining = a % b;  
            
            total += newBottles;     
            a = newBottles + remaining;  
       } 
       return  total;
    }
}