class Solution {
    public String removeDuplicates(String s) {
    int n=s.length();
    StringBuilder sb = new StringBuilder();
    for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        int l=sb.length();
        if(l>0 && sb.charAt(l-1)==ch){ 
            sb.deleteCharAt(l-1); 
        }
        else{
            sb.append(ch);
        }
    }
    return sb.toString();    
    }
}