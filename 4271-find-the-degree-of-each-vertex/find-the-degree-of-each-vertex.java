class Solution {
    public int[] findDegrees(int[][] matrix) {
    int n=matrix.length;
    int count=0;
    List<Integer> list=new ArrayList<>();
    for(int i=0;i<n;i++){
        count=0;
        for(int j=0;j<matrix[i].length;j++){ 
            if(matrix[i][j]==1){
                count++;
            }
            }
        list.add(count);
    }
    int k=0; 
    int[] arr=new int[list.size()];
    for(int num : list){
        arr[k++]=num;
    } 
    return arr;
    }
}