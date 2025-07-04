class Solution {
    public int leastInterval(char[] tasks, int n) {
        int []freq=new int[26];
        
        for(char task:tasks){
            freq[task-'A']++;

        }
        Arrays.sort(freq);

        int chunk=freq[25]-1;
        int idle=chunk*n;

        for(int i=24;i>=0;i--){
            idle-=Math.min(chunk,freq[i]);
        }

        if(idle<0){
            return tasks.length;
        }
        else{
             return tasks.length+idle;
        }
    }
}