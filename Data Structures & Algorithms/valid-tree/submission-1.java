

class Solution {
    public boolean validTree(int n, int[][] edges) {
        // Tree ke liye exactly n-1 edges honi chahiye
        if (edges.length != n - 1) {
            return false;
        }

        // Graph banao
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        // Agar DFS mein cycle mil gayi toh false
        if (!dfs(0, -1, graph, visited)) {
            return false;
        }

        // Check karo sab nodes visited hue ya nahi
        for (boolean nodeVisited : visited) {
            if (!nodeVisited) {
                return false;
            }
        }

        return true;
    }

    private boolean dfs(int node, int parent, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;

        for (int neighbour : graph.get(node)) {
            if (!visited[neighbour]) {
                if (!dfs(neighbour, node, graph, visited)) {
                    return false;
                }
            } else if (neighbour != parent) {
                // visited node mila jo parent nahi hai => cycle
                return false;
            }
        }

        return true;
    }
}