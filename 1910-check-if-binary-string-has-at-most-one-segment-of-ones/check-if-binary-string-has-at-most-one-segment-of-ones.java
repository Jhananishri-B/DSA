class Solution {
    public boolean checkOnesSegment(String s) {
    int n=s.length();
    boolean isZero=false;
    for(int i=0;i<n;i++){
        if(s.charAt(i)=='0'){
           isZero=true;
        }
        if(isZero && s.charAt(i)=='1'){
            return false;
        }
    }
    return true;
    }
}