class Solution {
    public int singleNumber(int[] arr) {
        HashMap<Integer,Integer>hm=new  HashMap<>();
        int res=0;
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}