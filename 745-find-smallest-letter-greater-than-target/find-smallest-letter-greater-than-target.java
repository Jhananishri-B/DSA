class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
    int min=Integer.MAX_VALUE;
    int n=letters.length;
    char ans=letters[0];
    for(int i=0;i<n;i++){
        if(letters[i]>target && letters[i]-target<min){
            min=letters[i]-target;
            ans=letters[i];
        }
    } 
    return ans;
    }
}