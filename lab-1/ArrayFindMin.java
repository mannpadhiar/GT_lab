import java.util.Scanner;
public class ArrayFindMin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i =0;i<n;i++){
            System.out.println("Enter your" + i +"th element : ");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int i =0;i<n;i++){
            if(arr[i] < min)min = arr[i];
            if(arr[i] > min)max = arr[i];
        }

        System.out.println("Min is : "+ min);
        System.out.println("Max is : "+ max);
        sc.close();
    }
}