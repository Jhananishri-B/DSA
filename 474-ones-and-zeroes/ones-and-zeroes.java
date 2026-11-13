class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] arr=new int[m+1][n+1];
        for(int i=0;i<strs.length;i++){
            int zero=0;
            int one=0;
            for(int j=0;j<strs[i].length();j++){
                if(strs[i].charAt(j)=='0'){
                    zero++;
                }
                else{
                    one++;
                }
            }
            for(int j=m;j>=zero;j--){
                for(int k=n;k>=one;k--){
                    arr[j][k]=Math.max(arr[j][k],1+arr[j-zero][k-one]);
                }
            }
        }
        return arr[m][n];
    }
}