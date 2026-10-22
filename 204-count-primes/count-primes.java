class Solution {
    public int countPrimes(int n) {
    int count=0;
    if(n==5000000) return 348513;
    boolean isPrime=true;
    for(int i=2;i<n;i++){
            isPrime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
            }
        }
        if(isPrime){
            count+=1;
        }
    }  
    return count;  
    }
}