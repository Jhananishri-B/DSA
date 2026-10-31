class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap <String,List<String>> mp= new HashMap<>(); 
    int n=strs.length;
    for(int i=0;i<n;i++){
        String curr=strs[i];
        char[] a=curr.toCharArray();
        Arrays.sort(a);
        String sorted=new String(a);
        if(!mp.containsKey(sorted)){
            mp.put(sorted,new ArrayList<>());       
        }
        mp.get(sorted).add(curr);
    }
    List<List<String>> ans=new ArrayList<>();
    for(List<String> s : mp.values()){
        ans.add(s);
    }
    return ans;
    }
}