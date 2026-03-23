class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph=new ArrayList<>();
        int dis[]=new int[n];
        Arrays.fill(dis,-1);
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int e[]:edges){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(source);
        dis[source]=0;
        while(!queue.isEmpty()){
            int node=queue.poll();
            if(node==destination){
                return true;
            }
            for(int nei:graph.get(node)){
                if(dis[nei]==-1){
                    dis[nei]=dis[node]+1;
                    queue.offer(nei);
                }
            }
        }
        return false;
    }
}