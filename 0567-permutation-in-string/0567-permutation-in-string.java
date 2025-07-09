class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1map = new int[26];
        int[] s2map = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1map[s1.charAt(i) - 'a']++;
            s2map[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (s1map[i] == s2map[i]) matches++;
        }

        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches == 26) return true;

            int r = s2.charAt(i + s1.length()) - 'a';
            int l = s2.charAt(i) - 'a';

            s2map[r]++;
            if (s2map[r] == s1map[r]) {
                matches++;
            } else if (s2map[r] == s1map[r] + 1) {
                matches--;
            }

            s2map[l]--;
            if (s2map[l] == s1map[l]) {
                matches++;
            } else if (s2map[l] == s1map[l] - 1) {
                matches--;
            }
        }

        return matches == 26;
    }
}
