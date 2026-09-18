class Solution {
    public boolean judgeSquareSum(int c) {
    int[] arr=new int[(int)Math.sqrt(c)+1];
    int k=0;
    for(int i=0;i<=Math.sqrt(c);i++){
        arr[k++]=i;
    }
    int l=0;
    int r=k-1;
    long sum=0;
    while(l<=r){
        sum=((long)arr[l]*arr[l]) + ((long)arr[r]*arr[r]);
        if(sum==c){
            return true;
        }
        if(sum<c){
            l++;
        }
        else{
            r--;
        }
    }
    return false;
    }
}