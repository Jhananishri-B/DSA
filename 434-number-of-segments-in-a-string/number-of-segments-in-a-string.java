class Solution {
    public int countSegments(String s) {
    int n=s.length();
    HashSet<Character> set  = new HashSet<>();
    int count=0;
    if(n==0){
        return 0;
    }
    for(int i=0;i<n;i++){
        if(s.charAt(i)!=' ' && (i==0|| s.charAt(i-1)==' ')){ 
            count++;
        }
    }
    return count;    
    }
}