import java.util.List;
import java.util.ArrayList;

class HallsCondition{
    public static void main(String[] args) {
        String side1[] = {"a","b","c"};
        int side2[] = {1,2,3};

        int[][] edges = {{1},{1},{}};

        List<String> temp = new ArrayList<>();
        List<List<String>> subsets = new ArrayList<>();

        boolean isHall = findHallsCondition(side1,side2,edges,0,temp,subsets);

        // for(List i : subsets){
        //     for(int j =0;j< i.size();j++){
        //         System.out.print(i.get(j)+" ");
        //     }
        //     System.out.println();
        // }
        System.out.println(isHall);

    }

    static boolean findHallsCondition(String side1[],int side2[],int[][] edges,int index,List<String> temp,List<List<String>> subsets){
        if(index == side1.length){
            subsets.add(new ArrayList<>(temp));
            int count1 = 0;
            for(String s : temp){
                count1 += edges[temp.indexOf(s)].length;
            }
            if(count1 < temp.size())return false;
            return true;
        }

        System.out.println("index : "+index);
        temp.add(side1[index]);
        findHallsCondition(side1,side2,edges,index+1,temp,subsets);
        temp.remove(temp.size() - 1);
        findHallsCondition(side1,side2,edges,index+1,temp,subsets);

        return true;
    }
}