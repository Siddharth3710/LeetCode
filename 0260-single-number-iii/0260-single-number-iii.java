class Solution {
    public int[] singleNumber(int[] nums) {
        ArrayList<Integer>a=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() == 1) {
                a.add(entry.getKey());
            }
        }
        int res[]=new int[a.size()];

        for(int  i=0;i<a.size();i++){
            res[i]=a.get(i);
        }
        return res;
    }
}