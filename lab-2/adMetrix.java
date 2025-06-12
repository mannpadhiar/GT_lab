

class AdMatrix{
    public static void main(String[] args) {
        int[][] arr = {{1,2},{1,3},{1,4},{2,3}}; 
        int temp = 0;


        for (int i = 0;i<arr.length;i++) {
            if(temp != arr[i][0]){
                System.err.println(arr[i][0]+"->");
                temp = arr[i][0];
                for(int j = 0; j < arr.length; j++) {
                    if (temp == arr[j][0]) {
                        System.out.print(arr[j][1]);
                    }
                }
                System.err.println("");
            }
        }

        inDegree(arr);
        OutDegree(arr);
    }

    public static void inDegree(int[][] arr) {

        int ans[] = new int[arr.length +1];
        for(int i=0;i<arr.length;i++){
            ans[arr[i][0]]++;
        }

        for(int i : ans){
            System.out.println("InDegree of "+i+"->"+ans[i]);
        }
    }

    public static void OutDegree(int[][] arr) {
        int temp = 0;
        int count = 0;

        int ans[] = new int[arr.length +1];
        for(int i=0;i<arr.length;i++){
            ans[arr[i][1]]++;
        }

        for(int i : ans){
            System.out.println("OutDegree of "+i+"->"+ans[i]);
        }
    }
}