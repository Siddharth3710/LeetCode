/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int sr=0;
        int sc=0;
        int er=m-1;
        int ec=n-1;

        int ans [][] = new int[m][n];

        for (int[] r : ans)
            Arrays.fill(r, -1);

        while(head!=null){
            //top
            for(int j=sc;j<=ec;j++){
                  if(head == null) break;
                 ans[sr][j]=head.val;
                head=head.next;
            }

            //right
            for(int i=sr+1;i<=er;i++){
                  if(head == null) break;
                ans[i][ec]=head.val;
                head=head.next;
            }
            //bottom
            for(int j=ec-1;j>=sc;j--){
                if(sr == er || head == null) {
                    break;
                }
                 ans[er][j]=head.val;
                head=head.next;
            }
            //left
            for(int i=er-1;i>=sr+1;i--){
                 if(sc == ec || head == null) {
                    break;
                }
                ans[i][sc]=head.val;
                head=head.next;
            }
            sc++;
            ec--;
            sr++;
            er--;
        }
        return ans;
    }
}