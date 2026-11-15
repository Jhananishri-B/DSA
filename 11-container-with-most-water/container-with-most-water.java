class Solution {
    public int maxArea(int[] height) {
    int l=0;
    int r=height.length-1;
    int len=0;
    int bre=0;
    int area=0;
    int max=0;
    while(l<r){
        len=Math.min(height[l],height[r]); 
        bre=r-l;
        area=len*bre;
        if(area>max){
            max=area;
        }
        if(height[l]<=height[r]){
            l++;
        }
        else{
            r--;
        }
    }    
    return max;
    }
}