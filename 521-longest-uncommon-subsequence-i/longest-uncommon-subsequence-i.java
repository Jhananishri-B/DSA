class Solution {
    public int findLUSlength(String a, String b) {
    if(b.length()==1){
      return a.length();
    }
    if(!a.equals(b)){
        return b.length();
    } 
    return -1;   
    }
}