class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i =0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        int [] indegree = new int[numCourses];
        for(int[] edge : prerequisites){
            int u = edge[0];
            int v = edge[1];
            graph.get(v).add(u);
            indegree[u]++;
        }
        Queue<Integer>queue = new LinkedList<>();
        int count =0;
        for(int i =0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            int node = queue.poll();
            count++;
            for(int neighbours : graph.get(node)){
                indegree[neighbours]--;
                if(indegree[neighbours]==0){
                    queue.offer(neighbours);
                }
            }
        }
        return count==numCourses;
        
    }
}
