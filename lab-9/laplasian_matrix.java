class LaplasianMatrix{
    public static void main(String[] args) {
        int[][] arr = {{0,2},{0,3},{2,3},{3,1}};

        int[][] adj = new int[4][4];

        int[][] deg = new int[4][4];

        int[][] lapMatrix = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                adj[i][j] = 0;
                deg[i][j] = 0;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                adj[arr[i][0]][arr[i][1]] = 1;
                adj[arr[i][1]][arr[i][0]] = 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                count += adj[i][j];
            }
            deg[i][i] = count;
        }

        for(int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj.length; j++) {
                lapMatrix[i][j] = deg[i][j] - adj[i][j];
            }
        }

    }
}