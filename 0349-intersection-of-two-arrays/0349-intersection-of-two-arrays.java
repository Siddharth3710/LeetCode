class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
         for(int num:arr1){
            hs.add(num);
        }

        for(int num:arr2){
            if(hs.contains(num)){
                result.add(num);
            }
        }


      int[] res = new int[result.size()];
        int i = 0;
        for (int num : result) {
            res[i++] = num;
        }

        return res;
    }
}