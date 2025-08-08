class Solution {
    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int currNum = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currNum = currNum * 10 + (ch - '0'); 
            } 
            else if (ch == '[') {
                strStack.push(currStr);
                numStack.push(currNum);
                currStr = new StringBuilder();
                currNum = 0;
            } 
            else if (ch == ']') {
                int repeat = numStack.pop();
                StringBuilder prevStr = strStack.pop();
                for (int i = 0; i < repeat; i++) {
                    prevStr.append(currStr);
                }
                currStr = prevStr;
            } 
            else { 
                currStr.append(ch);
            }
        }

        return currStr.toString();
    }

}