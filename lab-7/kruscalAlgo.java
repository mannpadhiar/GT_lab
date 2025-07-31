
import java.util.Arrays;

class KruscalALgo{

    static int[] mainParent = {};
    public static void main(String[] args) {
        int[][] arr = {
            {0,2,6},
            {0,1,10},
            {0,3,5},
            {2,3,4},
            {3,1,15}
        };   

        Arrays.sort(arr,(a,b) -> a[2] - b[2]);

        for (int i = 0; i < arr.length; i++) {
            if(find(arr[i][0]) != find(arr[i][1])){
                
                System.err.println("");
                union(arr[i][0],arr[i][i]);
            } 
        }
        
    }

    public static int find(int index){
        if(mainParent[index] == index){
            return  mainParent[index];
        }       
        return find(mainParent[index]);
    }

    public static void union(int first,int second){
        int parentFirst = find(first);
        int parentSecond = find(second);

        mainParent[parentFirst] = parentSecond;
    }
}