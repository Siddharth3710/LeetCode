class Solution {
    public int maxBottlesDrunk(int a, int b) {
         int total = a;  
        
        while(a >= b) { 
            int newBottles = a / b;  
            int remaining = a % b;  
            
            total += newBottles;    
            a = newBottles + remaining-1; 
        }
        
        return total;
    }
}