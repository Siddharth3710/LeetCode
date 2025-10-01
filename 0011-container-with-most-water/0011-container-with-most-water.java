class Solution {
    public int maxArea(int[] height) {
       int n=height.length;
       int lp=0;
       int rp=n-1;
       int area=0;
       while(lp<rp){
           int w=rp-lp;
           int h=Math.min(height[lp],height[rp]);
           int ca=w*h;

           area=Math.max(area,ca);
           if(height[lp]<height[rp]){
               lp++;
           }
           else {
               rp--;
           }
       }
       
return area;
    }
}