// TLE 

// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//     List<Integer> list = new ArrayList<>();
//     int n=nums.length;
//     int max=0;
//     for(int i=0;i<=n-k;i++){
//         max=nums[i];
//         for(int j=i;j<i+k;j++){
//             if(nums[j]>max){
//                 max=nums[j];
//             }
//         }
//         list.add(max);
//     }
//     int l=list.size();
//     int[] arr=new int[l];
//     int p=0;
//     for(int q : list){
//         arr[p++]=q;
//     }
//     return arr;
//     }
// }

// USE DEQUE OR PRIORITY QUEUE

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int p = 0;
        for (int i = 0; i < n; i++) {
            pq.add(new int[]{nums[i], i});
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }
            if (i >= k - 1) {
                ans[p] = pq.peek()[0];
                p++;
            }
        }
        return ans;
    }
}