class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int l=original.length;
        if(l!=m*n){
            return new int[0][0];
        }
        int[][] arr=new int[m][n];
        for(int i=0;i<l;i++){
            arr[i/n][i%n]=original[i];
    }
    return arr;
    }
}