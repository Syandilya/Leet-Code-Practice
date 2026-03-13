class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {
        int n = workerTimes.length;     
        PriorityQueue<long[]> pq = new PriorityQueue<>(
            (a, b) -> Long.compare(a[0], b[0])
        );
        long ans = 0;
        for(int i=0;i<n;i++){
            pq.offer(new long[]{workerTimes[i],workerTimes[i],1L});
        }
        while(mountainHeight > 0){
            long[] curr = pq.poll();
            ans = Math.max(ans,curr[0]);
            curr[2]++;
            curr[0] += curr[1]*curr[2];
            pq.offer(curr);
            mountainHeight--;
        }
        return ans;
    }


}