class Solution {
    public class Pair {
        char ch;
        int freq;

        Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }

    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> b.freq - a.freq);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }

        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            for (int i = 0; i < p.freq; i++) {
                sb.append(p.ch);
            }
        }

        return sb.toString();
    }
}