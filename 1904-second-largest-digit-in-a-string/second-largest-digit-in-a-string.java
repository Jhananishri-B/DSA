class Solution {
    public int secondHighest(String s) {
    int n=s.length();
    String num="";
    for(int i=0;i<n;i++){
        if(s.charAt(i)>='0' && s.charAt(i)<='9'){
            if (!num.contains(String.valueOf(s.charAt(i)))) {
                num=num+s.charAt(i);
        }
        }
    }
    char[] arr=num.toCharArray();
    Arrays.sort(arr);
    if(arr.length>=2){
        return arr[arr.length-2]-'0';
    }  
    else{
        return -1;
    }  
    }
}