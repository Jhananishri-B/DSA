class Solution {
    public String trimTrailingVowels(String s) {
    int n=s.length();
    String res="";
    int i=s.length()-1;
    while(i>=0){
       if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'){
        i--;
       }
       else{
        break;
       }
    } 
    return s.substring(0,i+1);  
    }
}