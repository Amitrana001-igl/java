package Array;
import java.util.Scanner;

public class SumOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter ur array size: ");
        int n = sc.nextInt();
        int sum =0;

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            sum+=arr[i];
        }
        System.out.print( sum);
    }
}
