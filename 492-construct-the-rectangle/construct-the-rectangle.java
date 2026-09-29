class Solution {
    public int[] constructRectangle(int area) {
        int l=0;
        int w=0;
    for(int i=1;i*i<=area;i++){
        if(area%i==0){
           l=area/i;
           w=i;
        }
    } 
    int[] arr=new int[2];
    arr[0]=l;
    arr[1]=w;
    return arr;   
    }
}