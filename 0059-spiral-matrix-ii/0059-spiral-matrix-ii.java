class Solution {
    public int[][] generateMatrix(int n) {
        int res[][]=new int[n][n];
        int sr=0;
        int sc=0;
        int er=res.length-1;
        int ec=res[0].length-1;
        int size=n*n;
        int cnt=1;

        while(cnt<=size){
            //top
            for(int j=sc;j<=ec;j++){
                res[sr][j]=cnt++;
            }

            //right

            for(int i=sr+1;i<=er;i++){
                res[i][ec]=cnt++;
            }
            //down
            for(int j=ec-1;j>=sc;j--){
                if(sr==er){
                    break;
                }
                res[er][j]=cnt++;
            }
            //left
             for(int i=er-1;i>=sr+1;i--){
                 if(sc==ec){
                    break;
                }
                res[i][sc]=cnt++;
            }
            sr++;
            er--;
            sc++;
            ec--;

        }
        return res;
    }
}