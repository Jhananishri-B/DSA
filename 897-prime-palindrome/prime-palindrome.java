class Solution {
    public int primePalindrome(int n) {
        if(n>=8 && n<=11) return 11;
        for(int x=1;x<100000;x++){
            int y=x;
            int t=x/10;
            while(t>0){
                y=y*10+t%10;
                t/=10;
            }
            if(y>=n && isPrime(y)) return y;
        }
        return -1;
    }
    boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}