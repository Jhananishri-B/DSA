class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
    int x=s.length();
    int count=0;
    int left=0;
    int ans=0;
    for(int i=0;i<x;i++){
            int diff=Math.abs(s.charAt(i)-t.charAt(i));
            count+=diff;
            while(count>maxCost){
                count-=Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
        ans=Math.max(ans,i-left+1);
    }
    return ans;    
    }
}