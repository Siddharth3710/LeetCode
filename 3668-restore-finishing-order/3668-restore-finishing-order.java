class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> a = new ArrayList<>();
        HashSet<Integer> friendsSet = new HashSet<>();
        for (int x : friends) friendsSet.add(x);  // Faster to look up

        for (int x : order) {
            if (friendsSet.contains(x)) a.add(x);
        }

        int[] res = new int[a.size()];
        for (int i = 0; i < res.length; i++) res[i] = a.get(i);
        return res;
    }
}
