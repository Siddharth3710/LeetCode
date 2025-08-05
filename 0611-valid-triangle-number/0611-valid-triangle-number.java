class Solution {
    public int triangleNumber(int[] arr) {
        int count = 0;
        Arrays.sort(arr);
        for (int k = arr.length - 1; k > 1; k--) {
            int i = 0;
            int j = k - 1;
            while (i < j) {
                if (arr[i] + arr[j] > arr[k]) {
                    count += j - i;
                    j--;
                } else {
                    i++;
                }
            }
        }
        return count;
    }
}
