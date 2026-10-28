class Solution {
    public boolean isPalindrome(String s) {
    String a="";
    int n=s.length();
    for(int i=0;i<n;i++){
        if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z')
        || s.charAt(i)>='0' && s.charAt(i)<='9'){
            a=a+s.charAt(i);
        }
    }  
    a=a.toLowerCase();
    int l=a.length();
    int left=0;
    int right=l-1;
    while(left<right){
        if(a.charAt(left)!=a.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
    }
}