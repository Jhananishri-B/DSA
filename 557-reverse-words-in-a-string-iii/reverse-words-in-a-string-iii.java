class Solution {
    public String reverseWords(String s) {
    int n=s.length();
    String[] words=s.split(" ");
    String res="";
    for(int i=0;i<words.length;i++){
       String word=words[i];
       for(int j=word.length()-1;j>=0;j--){
        res+=word.charAt(j);
       }
        if(i!=words.length-1){
            res+=" ";
       }
    } 
    return res;   
    }
}