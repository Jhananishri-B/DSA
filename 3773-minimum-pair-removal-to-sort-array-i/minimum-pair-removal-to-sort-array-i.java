class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int n:nums){
            list.add(n);
        }
        int count=0;
        while(true){
            boolean sorted=true;
            for(int i=1;i<list.size();i++){
                if(list.get(i)<list.get(i-1)){
                    sorted=false;
                    break;
                }
            }
            if(sorted) return count;
            int min=Integer.MAX_VALUE;
            int index=0;
            for(int i=0;i<list.size()-1;i++){
                int sum=list.get(i)+list.get(i+1);
                if(sum<min){
                    min=sum;
                    index=i;
                }
            }
            list.set(index,min);
            list.remove(index+1);
            count++;
        }
    }
}