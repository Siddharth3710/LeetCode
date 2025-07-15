class Solution {
      private boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }

        int con=0;
        int vow=0;
        for (char ch : word.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) return false;


           if(Character.isLetter(ch)){
            char lower=Character.toLowerCase(ch);
            if(isVowel(lower)){
                vow++;
            }
            else{
                con++;
            }
           }

        }


        if(con==0||vow==0){
            return false;
        }

return true;
        
    }
}