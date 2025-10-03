class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {

    

        int left = 0, right = 0;
        int maxSubString = 0;

        Map<Character, Integer> letters = new HashMap<>();
        Map<String, Integer> string = new HashMap<>();

        while (right < s.length()) {

            letters.put(s.charAt(right), letters.getOrDefault(s.charAt(right), 0) + 1);

            if ((right - left + 1) > minSize) {

                letters.put(s.charAt(left), letters.get(s.charAt(left)) - 1);

                if (letters.get(s.charAt(left)) == 0) {
                    letters.remove(s.charAt(left));
                }
                left++;
            }

            if (letters.size() <= maxLetters && (right - left + 1) == minSize) {
                String str = s.substring(left, right + 1);
                string.put(str, string.getOrDefault(str, 0) + 1);
                maxSubString = Math.max(maxSubString, string.get(str));
            }

            right++;

        }

        return maxSubString;
        
    }
}