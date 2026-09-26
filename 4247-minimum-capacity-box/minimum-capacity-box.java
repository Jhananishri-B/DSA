class Solution {
    public int minimumIndex(int[] cap, int s) {
    int n=cap.length;
    int min=Integer.MAX_VALUE; // using max value bcoz we need to compare with the ever largest value that is possible in the cap array, if min is set to 0 then during 1st iteration it will not provide the actaul value to min 
    int idx=-1;
    for(int i=0;i<n;i++){
      if(cap[i]>=s && cap[i]<min){
        min=cap[i];
        idx=i;
      }
    }  
    return idx;  
    }
}