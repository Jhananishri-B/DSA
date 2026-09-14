class Solution {
    public int maxScore(int[] arr, int k) {
    int n=arr.length;
    int sum=0;
    int max=0;
    for(int i=0;i<k;i++){
        sum+=arr[i];
    } 
    int right=n-1;
    max=sum;
    for (int i = k - 1; i >= 0; i--) {
        sum -= arr[i];
        sum += arr[right];
        right--;
        max = Math.max(max, sum);
    }
    return max;
    }
}