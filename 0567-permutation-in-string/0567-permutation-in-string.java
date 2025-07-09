class Solution {
    public boolean checkInclusion(String s1, String s2) {
        List<List<String>> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        return backtrack(0, s1, s2, sb, new ArrayList<>(), res);
    }

    public boolean backtrack(int index, String s1, String s2, StringBuilder sb, List<String> path, List<List<String>> res) {
        if (s1.length() == sb.length()) {
            String perm = sb.toString();
            if (s2.contains(perm)) {
                return true;
            }
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (sb.toString().indexOf(s1.charAt(i)) != -1) continue; // to avoid duplicates if needed

            sb.append(s1.charAt(i));
            path.add(String.valueOf(s1.charAt(i)));

            if (backtrack(i + 1, s1, s2, sb, path, res)) {
                return true;
            }

            sb.deleteCharAt(sb.length() - 1);
            path.remove(path.size() - 1);
        }

        return false;
    }
}
