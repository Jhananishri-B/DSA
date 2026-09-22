class Solution {
    public int maxRepeating(String s, String t) {
        int count=0;
        String temp=t;
        while(s.contains(temp)){
            count+=1;
            temp+=t;
        }
    return count;    
    }
}