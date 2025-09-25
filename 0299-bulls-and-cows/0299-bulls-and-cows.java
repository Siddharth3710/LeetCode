class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0;
        int cow = 0;
        HashMap<Character, Integer> secretMap = new HashMap<>();
        HashMap<Character, Integer> guessMap = new HashMap<>();
        
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);  
            char g = guess.charAt(i);   
            
            if (s == g) {
                bull++;
            } else {
                
                secretMap.put(s, secretMap.getOrDefault(s, 0) + 1);
                guessMap.put(g, guessMap.getOrDefault(g, 0) + 1);  
            }
        }
        
        
        for (char c : secretMap.keySet()) {  
            if (guessMap.containsKey(c)) {
                cow += Math.min(secretMap.get(c), guessMap.get(c));
            }
        }
        
        return bull + "A" + cow + "B";

    }
}