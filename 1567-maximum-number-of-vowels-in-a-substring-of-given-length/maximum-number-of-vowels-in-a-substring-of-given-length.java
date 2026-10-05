class Solution {
    public int maxVowels(String s, int k) {
    int count=0;
    int max=0;
    int left=0;
    for(int i=0;i<k;i++){
       if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'){
        count++;
       }
    } 
    max=count;
    for(int i=k;i<s.length();i++){
        if(s.charAt(left)=='a' || s.charAt(left)=='e' ||s.charAt(left)=='i' ||s.charAt(left)=='o' ||s.charAt(left)=='u'){
            count--;
        }
        if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'){
            count++;
        }
        left++;
        if(count>max){
            max=count;
        }
    }
    return max;
    }
}