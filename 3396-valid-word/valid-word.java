class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }
        boolean v=false;
        boolean c=false;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if(Character.isLetter(ch)){
                if("aeiouAEIOU".indexOf(ch)!=-1){
                    v=true;
                }
                else{
                    c=true;
                }
            }
        }
        return v && c;
    }
}