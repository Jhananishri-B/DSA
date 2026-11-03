class Solution {
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> list=new ArrayList<>();
        int n=num.length();
        for(int i=1;i<=n/2;i++){
            if(num.charAt(0)=='0'&&i>1) break;
            long a=Long.parseLong(num.substring(0,i));
            if(a>Integer.MAX_VALUE) break;
            for(int j=i+1;j<n;j++){
                if(num.charAt(i)=='0'&&j-i>1) break;
                long b=Long.parseLong(num.substring(i,j));
                if(b>Integer.MAX_VALUE) break;
                list.clear();
                list.add((int)a);
                list.add((int)b);
                long x=a;
                long y=b;
                int k=j;
                while(k<n){
                    long c=x+y;
                    if(c>Integer.MAX_VALUE) break;
                    String next=String.valueOf(c);
                    if(!num.startsWith(next,k)) break;
                    list.add((int)c);
                    k+=next.length();
                    x=y;
                    y=c;
                }
                if(k==n&&list.size()>=3) return new ArrayList<>(list);
            }
        }
        return new ArrayList<>();
    }
}