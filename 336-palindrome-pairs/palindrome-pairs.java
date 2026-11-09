class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> list=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],i);
        }
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=0;j<=s.length();j++){
                String left=s.substring(0,j);
                String right=s.substring(j);
                int l=0;
                int r=left.length()-1;
                boolean flag=true;
                while(l<r){
                    if(left.charAt(l)!=left.charAt(r)){
                        flag=false;
                        break;
                    }
                    l++;
                    r--;
                }
                if(flag){
                    char[] arr=right.toCharArray();
                    l=0;
                    r=arr.length-1;
                    while(l<r){
                        char temp=arr[l];
                        arr[l]=arr[r];
                        arr[r]=temp;
                        l++;
                        r--;
                    }
                    String rev=new String(arr);
                    if(map.containsKey(rev)&&map.get(rev)!=i){
                        list.add(Arrays.asList(map.get(rev),i));
                    }
                }
                l=0;
                r=right.length()-1;
                flag=true;
                while(l<r){
                    if(right.charAt(l)!=right.charAt(r)){
                        flag=false;
                        break;
                    }
                    l++;
                    r--;
                }
                if(flag&&j!=s.length()){
                    char[] arr=left.toCharArray();
                    l=0;
                    r=arr.length-1;
                    while(l<r){
                        char temp=arr[l];
                        arr[l]=arr[r];
                        arr[r]=temp;
                        l++;
                        r--;
                    }
                    String rev=new String(arr);
                    if(map.containsKey(rev)&&map.get(rev)!=i){
                        list.add(Arrays.asList(i,map.get(rev)));
                    }
                }
            }
        }
        return list;
    }
}