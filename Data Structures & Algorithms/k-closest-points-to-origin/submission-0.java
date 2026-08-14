class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);

        for(int[] i:points){
           int j = (i[0]*i[0])+(i[1]*i[1]);
           pq.offer(new int[] {j,i[0],i[1]});

        }
        int[][] arr = new int[k][2];
        for(int i=0;i<k;i++){
            int[]curr = pq.poll();
            arr[i][0] = curr[1];
            arr[i][1] = curr[2];
        }
        return arr;

    }
}
