import java.util.*;

class DominentSet{
    public static void main(String[] args) {
        int n = 4;
        int nodes[] = {0,1,2,3};
        int arr[][] = {{0,1},{0,2},{1,3},{2,3}};


        List<List<Integer>> subSets = new ArrayList<>();

        List<List<Integer>> adjList = new ArrayList<>();
        
        for (int i = 0; i < 4; i++) {
            adjList.add(new ArrayList());
        }


        for (int i = 0; i < arr.length; i++) {
            int u = arr[i][0];
            int v = arr[i][1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        System.out.println(adjList);

        for (int i = 0; i < nodes.length; i++) {

            for (int j = i; j < nodes.length; j++) {
                List<Integer> temp = new ArrayList<>();

                for (int k = i; k <= j; k++) {
                    temp.add(k);
                }

                if(checkDominent(temp, adjList))
                subSets.add(temp);
            } 
        }

        System.out.println(subSets);
    }

    static boolean checkDominent(List<Integer> subSets,List<List<Integer>> adjList){
        boolean visited[] = new boolean[4];

        for (int i : subSets) {
            for (int j : adjList.get(i)) {
                visited[j] = true;                
            }
        }

        for (boolean i : visited) {
            if(!i)return false;
        }

        return true;
    }
}