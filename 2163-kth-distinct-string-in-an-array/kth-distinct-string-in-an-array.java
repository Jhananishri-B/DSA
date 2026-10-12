class Solution {
    public String kthDistinct(String[] arr, int k) {
    List<String> list=new ArrayList<>();
    for(String s : arr){
        int count=0;
        for(String x : arr){
            if(s.equals(x)){
                count++;
            }
    }   
    if(count==1){
        list.add(s);
    }
    }
    if(list.size()<k){
        return "";
    }
    return list.get(k-1); 
    }
}