class Solution {
    public int commonFactors(int a, int b) {
    List<Integer> l1=new ArrayList<>();
    List<Integer> l2=new ArrayList<>();
    int count=0;
    for(int i=1;i<=a;i++){
        if(a%i==0){
            l1.add(i);
        }
    }    
    for(int i=1;i<=b;i++){
        if(b%i==0){
            l2.add(i);
        }
    } 
    for(int i=0;i<l1.size();i++){
        if(l2.contains(l1.get(i))){
            count++;
        }
    } 
    return count;
    }
}