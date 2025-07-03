class Solution {
    public int[] sortArray(int[] nums) {

         merge(nums,0,nums.length-1);
        return nums;
    }

    private void  merge(int a[],int l,int u){
        if(l>=u){
            return;
        }
        int mid=l+(u-l)/2;

        merge(a,l,mid);
        merge(a,mid+1,u);
        mergesort(a,l,mid,u);
    }
    private int [] mergesort(int a[],int l,int mid,int u){
        int i=l,j=mid+1,k=0;

        int temp[]=new int[u-l+1];

        while(i<=mid && j<=u){
            if(a[i]<a[j]){
                temp[k++]=a[i++];
            }
            else{
                temp[k++]=a[j++];
            }
        }
          while (i <= mid) {
            temp[k++] = a[i++];
        }
        while(j<=u){
              temp[k++]=a[j++];
        }

       for (k = 0; k < temp.length; k++) {
            a[l + k] = temp[k];
        }

        return temp;
    }
}