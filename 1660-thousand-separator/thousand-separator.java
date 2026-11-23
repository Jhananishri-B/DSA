class Solution {
    public String thousandSeparator(int n) {
        String s = String.valueOf(n);
        String result="";
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            result=s.charAt(i)+result;
            count++;
            if(count==3 && i!=0){
                result="."+result;
                count=0;
            }
        }
        return result;
    }
}