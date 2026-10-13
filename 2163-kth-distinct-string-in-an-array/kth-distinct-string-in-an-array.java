class Solution {
    public String kthDistinct(String[] arr, int k) {
    HashMap<String,Integer> map=new HashMap<>();
    List<String> list = new ArrayList<>();
    String res="";
    for(String i : arr){
        map.put(i,map.getOrDefault(i,0)+1);
    }
    for(String i : arr){
        if(map.get(i)==1){
            list.add(i);
        }
    }
    if(list.size()<k){
        return "";
    }
    return list.get(k-1);
    }
}