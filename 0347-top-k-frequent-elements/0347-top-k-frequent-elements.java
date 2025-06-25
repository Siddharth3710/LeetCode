import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        ArrayList<Integer> a = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((x, y) -> y.getValue() - x.getValue());

        
        for (int i = 0; i < k; i++) {
            a.add(list.get(i).getKey());
        }

       
        int res[] = new int[a.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = a.get(i);
        }

        return res;
    }
}
