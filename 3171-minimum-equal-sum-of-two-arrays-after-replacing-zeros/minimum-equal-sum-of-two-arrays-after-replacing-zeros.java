class Solution {
    public long minSum(int[] nums1, int[] nums2) {
    long s1=0,s2=0;
    int z1=0,z2=0;
    for(int n:nums1){
        if(n==0){
            z1++;
        }
        else{
            s1+=n;
        }
    }
    for(int n:nums2){
        if(n==0){
            z2++;
        }
        else{
            s2+=n;
        }
    }
    s1+=z1;
    s2+=z2;
    if(s1==s2){
        return s1;
    }
    if(s1>s2 &&z2==0){
        return -1;
    }
    if(s2>s1 && z1==0){
        return -1;
    }
    return Math.max(s1,s2);
    }
}