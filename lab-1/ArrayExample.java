import java.util.Scanner;

public class ArrayExample{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}

