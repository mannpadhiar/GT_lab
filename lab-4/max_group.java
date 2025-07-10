class MaxGroup{
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,1,1},
            {1,1,1,0},
            {1,1,1,1},
            {1,0,1,1},
        };

        DFSTree dFSTree = new DFSTree();
        boolean[] visited = new boolean[arr.length];
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(!visited[i]){
                dFSTree.dfs(arr, visited, i);
                count++;
            }
        }

        System.err.println("count is : " + count);
    }

}

class DFSTree{
    public void dfs(int[][] arr,boolean[] visited,int start){
        visited[start] = true;
        for(int i=0;i<arr.length;i++){
            if(visited[i] == false && arr[start][i] == 1){
                dfs(arr, visited, i);
            }
        }
    }
}