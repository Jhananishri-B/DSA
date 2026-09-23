class Solution {
    public boolean detectCapitalUse(String word) {
    int n=word.length();
    int count1=0;
    int count2=0;
    HashSet<Character> set=new HashSet<>();
    for(int i=0;i<n;i++){
        set.add(word.charAt(i));
    }
    if(set.size()==1) return true;
    for(int i=0;i<n;i++){
         if(word.charAt(i)>='a' && word.charAt(i)<='z'){
            count1++;
         }
    }
    for(int i=0;i<n;i++){
        if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
            count2++;
        }
    }
    if (count2 == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
        return true;
    }
        if(count1==n || count2==n){
            return true;
        } 
    return false;  
    }
}