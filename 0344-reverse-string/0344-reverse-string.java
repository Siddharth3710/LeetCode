class Solution {
    public void reverseString(char[] s) {
        int l=0;
        int r=s.length-1;
        for(int i=0;i<s.length/2;i++){
            char ch=s[l];
            s[l]=s[r];
            s[r]=ch;
            l++;
            r--;
        }

    }
}