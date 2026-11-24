class Solution {
    public int maxLength(int[] nums) {
        int n=nums.length;
        int max=1;
        for(int i=0;i<n;i++){
            long prod=1;
            int gcd=0;
            long lcm=1;
            for(int j=i;j<n;j++){
                int x=nums[j];
                long a=lcm;
                int b=x;
                while(b!=0){
                    int t=(int)(a%b);
                    a=b;
                    b=t;
                }
                lcm=(lcm/a)*x;
                int p=gcd;
                int q=x;
                while(q!=0){
                    int t=p%q;
                    p=q;
                    q=t;
                }
                gcd=p;
                prod*=x;
                if(prod==lcm*gcd){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}
