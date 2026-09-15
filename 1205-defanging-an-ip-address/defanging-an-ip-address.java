class Solution {
    public String defangIPaddr(String s) {
    int n=s.length();
    String res="";
    for(int i=0;i<n;i++){
        if(s.charAt(i)!='.'){
            res=res+s.charAt(i); 
        }
        else if(s.charAt(i)=='.'){
            res=res+'[';
            res=res+'.';
            res=res+']';
        }
    }
    return res;
    }
}