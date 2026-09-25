class Solution {
    public int maxPower(String s) {
    int n=s.length();
    int count=1;
    int ans=1;
    for(int i=0;i<n-1;i++){
        if(i<n-1 && s.charAt(i)==s.charAt(i+1)){
            count++;
        }
        else{
            count=1;
        }
        ans=Math.max(ans,count);
    } 
    return ans; 
    }
}