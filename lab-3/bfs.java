
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Bfs{
    public static void main(String[] args) {
        int[][] arr = {{1,2},{1,3},{1,4},{2,3}}; 

        Queue<Integer> queue = new LinkedList<>();

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();  
        ArrayList<Integer> ansList = new ArrayList<>();  

        boolean[] v = new boolean[5];

        for(int i =0;i<5;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i<arr.length;i++){
            adjList.get(arr[i][0]).add(arr[i][1]);
            adjList.get(arr[i][1]).add(arr[i][0]);
        }

        queue.add(1);
        v[1] = true;

        while(!queue.isEmpty()){
            int temp = queue.poll();
            ansList.add(temp);
            for(int a : adjList.get(temp)){
                if(!v[a]){
                    v[a] = true;
                    queue.add(a);
                }
                // if(!ansList.contains(a) && !queue.contains(a)){
                //     queue.add(a);
                // }
            }
        }

        System.err.println(ansList);

        System.err.println(adjList);
        
    }
}



