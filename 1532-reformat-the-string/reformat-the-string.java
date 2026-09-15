class Solution {
    public String reformat(String s) {
    int n=s.length();
    int count1=0;
    if(n==1){
        return s;
    }
    for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(ch>='0' && ch<='9'){
            count1++;
        }
    } 
    int count2=0;
    for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(ch>='a' && ch<='z'){
            count2++;            
        }
    }
    if (Math.abs(count1 - count2) > 1) {
        return "";
    }
    if(count2==n || count1==n){
        return "";
    }
    String res1="";
    for(int i=0;i<n;i++){
        if(s.charAt(i)>='0' && s.charAt(i)<='9'){
            res1=res1+s.charAt(i);
        }
    }
    String res2="";
    for(int i=0;i<n;i++){
        if(s.charAt(i)>='a' && s.charAt(i)<='z'){
            res2=res2+s.charAt(i);
        }
    }
 String res = "";
if (count1 > count2) {
    int j = 0;
    for (int i = 0; i < res1.length(); i++) {
        res = res + res1.charAt(i);
        if (j < res2.length()) {
            res = res + res2.charAt(j);
            j++;
        }
    }
    for (int i = j; i < res2.length(); i++) {
        res = res + res2.charAt(i);
    }
} else {
    int j = 0;
    for (int i = 0; i < res2.length(); i++) {
        res = res + res2.charAt(i);
        if (j < res1.length()) {
            res = res + res1.charAt(j);
            j++;
        }
    }
    for (int i = j; i < res1.length(); i++) {
        res = res + res1.charAt(i);
    }
}
return res;
} 
}