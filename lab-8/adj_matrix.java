

class AdjMatrix{
    public static void main(String[] args) {
        int[][] arr = {{0,1},{3,4},{0,4}};
        int[] nodes = {1,2,3,4,5};
        int n = 5;
        int m = 5;

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = 0;
            }
        }

        for (int[] arr1 : arr) {
            matrix[arr1[0]][arr1[1]]++; 
            matrix[arr1[1]][arr1[0]]++; 
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.err.print(matrix[i][j]);
            }
            System.err.println("");
        }

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] != 0)count++;
            }
            if(count == 0)System.out.println(nodes[i]);
        }
    }
}
