class Solution {
    public int compareVersion(String version1, String version2) {
      String []p1=version1.split("\\.");
        String []p2=version2.split("\\.");

        int len=Math.max(p1.length,p2.length);

        for(int i=0;i<len;i++){

            int v1=i<p1.length?Integer.parseInt(p1[i]) : 0;
            int v2=i<p2.length?Integer.parseInt(p2[i]) : 0;

            if (v1 > v2) return 1;
            if (v1 < v2) return -1;
        }
        return 0;
    }
}