class Solution {
    public int[] rearrangeArray(int[] arr) {
          Queue<Integer> q1 = new LinkedList<>();  // positives
        Queue<Integer> q2 = new LinkedList<>();  // negatives
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                q1.add(arr[i]);
            } else {
                q2.add(arr[i]);
            }
        }

        int i = 0;


        while (!q1.isEmpty() && !q2.isEmpty()) {
            arr[i++] = q1.poll();
            arr[i++] = q2.poll();
        }


        while (!q1.isEmpty()) {
            arr[i++] = q1.poll();
        }

        while (!q2.isEmpty()) {
            arr[i++] = q2.poll();
        }

        return arr;
    }
}