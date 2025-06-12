class Solution {
    public List<Integer> majorityElement(int[] arr) {

        ArrayList<Integer>a=new ArrayList<>();     
           HashMap<Integer,Integer>map=new  HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        
          if (map.get(arr[i]) > arr.length / 3 && !a.contains(arr[i])) {
                a.add(arr[i]);
            }
        }

       

        return a;
    }
}