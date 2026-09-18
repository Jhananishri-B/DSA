class Solution {
    public int balancedStringSplit(String s) {
    int n=s.length();
    int count=0,l=0,r=0;
    for(int i=0;i<n;i++){
        if(s.charAt(i)=='L'){
            l++;
        }
        else{
            r++;
        }
        if(l==r){
            count++;
        }
    } 
    return count;   
    }
}