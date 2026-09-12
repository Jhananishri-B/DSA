class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    List<Integer> arr =new ArrayList<>();
    int n=s.length();
    int m=p.length();
    if(m>n){
        return arr;
    }
    char[] p1 = p.toCharArray();
    Arrays.sort(p1);
    String ans2 = new String(p1);

    for(int i=0;i<=n-m;i++){
        String temp=s.substring(i,i+m);
        char[] t=temp.toCharArray();
        Arrays.sort(t);
        String ans1 = new String(t);

        if(ans2.equals(ans1)){
            arr.add(i);
        }
    }
    return arr;
    }
}