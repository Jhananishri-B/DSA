class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:stones){
            list.add(i);
        }
        while(list.size()>1){
            Collections.sort(list,Collections.reverseOrder());
            int x=list.remove(0);
            int y=list.remove(0);
            if(x!=y){
                list.add(x-y);
            }
        }
        if(list.isEmpty()){
            return 0;
        }
        else{
            return list.get(0);
        }    
    }
}