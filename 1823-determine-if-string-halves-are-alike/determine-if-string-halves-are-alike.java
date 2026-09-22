class Solution {
    public boolean halvesAreAlike(String s) {
    String w=s.toLowerCase();
    int l=w.length();
    int h=l/2;
    String left=w.substring(0,h);
    String right=w.substring(h,l); 
    int countl=0;
    int countr=0;
    for(int i=0;i<left.length();i++){
        if(left.charAt(i)=='a' || left.charAt(i)=='e' || left.charAt(i)=='i' || left.charAt(i)=='o' || left.charAt(i)=='u'){
            countl++;
        }
    }
    for(int i=0;i<right.length();i++){
        if(right.charAt(i)=='a' || right.charAt(i)=='e' || right.charAt(i)=='i' || right.charAt(i)=='o' || right.charAt(i)=='u'){
            countr++;
        }
    }
    return countr==countl;
    }
}