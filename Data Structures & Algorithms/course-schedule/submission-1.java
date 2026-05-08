class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>>graph = new ArrayList<>();
        for(int i =0; i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int [] indegree = new int[numCourses];
        for(int[] edge:prerequisites){
            int u = edge[0];
            int v= edge[1];
            graph.get(v).add(u);
            indegree[u]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i =0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        int count=0;
        while(!queue.isEmpty()){
            int node = queue.poll();
            count++;
            for(int neighbour: graph.get(node)){
                indegree[neighbour]--;
                if(indegree[neighbour]==0){
                    queue.offer(neighbour);
                }
            }
        }
        return count==numCourses;
    }
}