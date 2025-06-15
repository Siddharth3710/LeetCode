class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int temp[] = new int[n];
        int prod = 1;
        int zeroCount = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeroCount++;
                continue;
            }
            prod *= arr[i];
        }

        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                temp[i] = 0;
            } else if (zeroCount == 1) {
                temp[i] = (arr[i] == 0) ? prod : 0;
            } else {
                temp[i] = prod / arr[i];
            }
        }

        return temp;
       

    }
}
