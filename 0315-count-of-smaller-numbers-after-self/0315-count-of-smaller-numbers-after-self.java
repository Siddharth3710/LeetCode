class Solution {
    public List<Integer> countSmaller(int[] nums) {
        ArrayList<Integer>a=new ArrayList<>();
        ArrayList<Integer>res=new ArrayList<>();


        for(int i=nums.length-1;i>=0;i--){

            int idx=bin(a,nums[i]);
            res.add(idx);
            a.add(idx,nums[i]);
        }
        Collections.reverse(res);
      return res;           
    }

    private int bin(ArrayList<Integer>a,int tar){
        int s=0,e=a.size();

        while(s<e){
            int mid=s+(e-s)/2;

            if(a.get(mid)<tar){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }

        return s;
    }
}