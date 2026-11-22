class Solution {
    public boolean checkString(String s) {
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        String p="";
        for(char i : arr){
            p=p+i;
        }
        return s.equals(p);
    }
}