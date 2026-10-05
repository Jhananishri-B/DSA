class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
        int count1=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                count1++;
            }
            else{
                count1--;
                if(s.charAt(i-1)=='('){
                    count+=Math.pow(2,count1);
                }
            }
        }  
        return count;
    }
}