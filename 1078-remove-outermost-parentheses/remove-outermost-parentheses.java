class Solution {
    public String removeOuterParentheses(String s) {
        int cnt=0;
        String ans="";
    for(char x : s.toCharArray()){
        if(x=='('){
            if(cnt>0){
                ans+=x;
            }
            cnt++;
        }
        else{
            cnt--;
            if(cnt>0){
                ans+=x;
            }
        }
    }
    return ans;
    }
}