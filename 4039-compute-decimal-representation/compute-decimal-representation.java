class Solution {
    public int[] decimalRepresentation(int n) {
    List<Integer> list=new ArrayList<>();
    int place=1;
    int temp=n;
    while(temp>0){
        int digit=temp%10;
        if(digit!=0){
            list.add(digit*place);
        }
        temp/=10;
        place=place*10;
    }   
    int[] arr=new int[list.size()];
    int k=0;
    for(int i=list.size()-1;i>=0;i--){
        arr[k++]=list.get(i);
    }
    return arr;
    }
}