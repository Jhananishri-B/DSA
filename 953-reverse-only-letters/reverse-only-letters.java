class Solution {
    public String reverseOnlyLetters(String s) {
    int n=s.length();
    int l=0;
    int r=n-1;
    char[] ch=s.toCharArray();
    while(l<r){
        if(!(ch[l]>='a' && ch[l]<='z' || ch[l]>='A' && ch[l]<='Z')){
            l++;
        }
        else if(!(ch[r]>='a' && ch[r]<='z' || ch[r]>='A' && ch[r]<='Z')){
            r--;
        }
        else{
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
        l++;
        r--;
        }
    } 
    String res="";
    for(int i=0;i<ch.length;i++){
        res=res+ch[i];
    }
    return res;   
    }
}