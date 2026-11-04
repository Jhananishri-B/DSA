import java.util.*;

class Solution {

    TreeMap<Long,Integer> left=new TreeMap<>();
    TreeMap<Long,Integer> right=new TreeMap<>();

    int lsize=0;
    int rsize=0;
    long lsum=0;
    long rsum=0;

    void add(TreeMap<Long,Integer> map,long val){
        map.put(val,map.getOrDefault(val,0)+1);
    }

    void remove(TreeMap<Long,Integer> map,long val){
        int c=map.get(val);
        if(c==1) map.remove(val);
        else map.put(val,c-1);
    }

    void insert(long val){
        if(left.isEmpty()||val<=left.lastKey()){
            add(left,val);
            lsize++;
            lsum+=val;
        }
        else{
            add(right,val);
            rsize++;
            rsum+=val;
        }
        balance();
    }

    void delete(long val){
        if(left.containsKey(val)){
            remove(left,val);
            lsize--;
            lsum-=val;
        }
        else{
            remove(right,val);
            rsize--;
            rsum-=val;
        }
        balance();
    }

    void balance(){
        while(lsize>rsize+1){
            long val=left.lastKey();
            remove(left,val);
            lsize--;
            lsum-=val;

            add(right,val);
            rsize++;
            rsum+=val;
        }

        while(lsize<rsize){
            long val=right.firstKey();
            remove(right,val);
            rsize--;
            rsum-=val;

            add(left,val);
            lsize++;
            lsum+=val;
        }
    }

    long getCost(){
        long median=left.lastKey();
        return median*lsize-lsum+rsum-median*rsize;
    }

    public long minOperations(int[] nums,int x,int k) {
        int n=nums.length;
        long[] cost=new long[n-x+1];

        left.clear();
        right.clear();
        lsize=0;
        rsize=0;
        lsum=0;
        rsum=0;

        for(int i=0;i<x;i++){
            insert(nums[i]);
        }

        cost[0]=getCost();

        for(int i=x;i<n;i++){
            delete(nums[i-x]);
            insert(nums[i]);
            cost[i-x+1]=getCost();
        }

        long INF=Long.MAX_VALUE/4;
        long[] prev=new long[n+1];
        long[] cur=new long[n+1];

        for(int j=1;j<=k;j++){
            Arrays.fill(cur,INF);

            for(int i=1;i<=n;i++){
                cur[i]=cur[i-1];

                if(i>=x&&prev[i-x]!=INF){
                    cur[i]=Math.min(cur[i],prev[i-x]+cost[i-x]);
                }
            }

            long[] temp=prev;
            prev=cur;
            cur=temp;
        }

        return prev[n];
    }
}