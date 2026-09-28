class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
    int n=order.length;
    List<Integer> list=new ArrayList<>();
    for(int i=0;i<n;i++){
        for(int j=0;j<friends.length;j++){ 
        if(order[i]==friends[j]){
            list.add(order[i]);
        }
        }
    } 
    int k=list.size();
    int l=0;
    int arr[] = new int[k];
    for(int num : list){
         arr[l++]=num;
    }  
    return arr; 
    }
}