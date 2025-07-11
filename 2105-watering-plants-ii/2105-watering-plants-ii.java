class Solution {
   public int minimumRefill(int[] arr, int capacityA, int capacityB) {

    int cnt = 0; // number of refills
    int remainingA = capacityA;
    int remainingB = capacityB;
    int n = arr.length;

    if (n == 1) return 0;

    int r = n - 1;

    for (int l = 0; l < n; ++l) {

        if (l == r) {
           
            if (remainingA >= remainingB) {
                if (remainingA < arr[l]) {
                    remainingA = capacityA;
                    cnt++;
                }
            } 
           
            else {
                if (remainingB < arr[r]) {
                    remainingB = capacityB;
                    cnt++;
                }
            }
            break;
        }

        if (remainingA < arr[l]) {
            remainingA = capacityA;
            cnt++;
        }

        if (remainingB < arr[r]) {
            remainingB = capacityB;
            cnt++;
        }

        remainingA -= arr[l];
        remainingB -= arr[r];

        r--;

        if (l == r) break; 
    }

    return cnt;
}

}