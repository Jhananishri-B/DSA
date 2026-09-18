class Solution {
    public int minimumBoxes(int[] x, int[] y) {
    int n=x.length;
    int sum=0;
    int count=0;
    Arrays.sort(y);
    for(int i=0;i<n;i++){
        sum+=x[i];
    }
    int m=y.length;
    for(int i=m-1;i>=0;i--){
        sum=sum-y[i];
        if(sum>0){
        count++;
        }
    }
    return count+1;
    }
}