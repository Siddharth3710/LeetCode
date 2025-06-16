class Solution {
    public int[][] merge(int[][] arr) {
      Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int []>list=new ArrayList<>();

        for(int []interval:arr){
            if(list.size()==0){
                list.add(interval);
            }
            else{
               int preinterval[]=list.get(list.size()-1);

                    if(preinterval[1]>=interval[0]){
                        preinterval[1]=Math.max(preinterval[1],interval[1]);
                    }
                    else{
                        list.add(interval);
                    }
                }
            }


        return list.toArray(new int[list.size()][]);
    }
}