class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int max=0,min=Integer.MAX_VALUE;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            boolean isPrime=true;
            if(nums[i]<2){
                isPrime=false;
            }
            for(int j=2;j*j<=nums[i];j++){
                if(nums[i]%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                list.add(i);
            }
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
            if(list.get(i)<min){
                min=list.get(i);
            }
        }
        return max-min;
    }
}