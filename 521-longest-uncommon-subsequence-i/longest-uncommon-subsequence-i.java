class Solution {
    public int findLUSlength(String a, String b) {
    // if(b.length()==1){
    //   return a.length();
    // }   does not works for all cases, so return the , max length of both a and b
    if(!a.equals(b)){
        return Math.max(a.length(),b.length());
    } 
    return -1;   
    }
}