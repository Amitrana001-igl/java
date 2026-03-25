package Array;

import java.util.*;
public class MaximumElementArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of elements: ");
        int n  = sc.nextInt();


        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int max = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>max) max = arr[i];
        }
        System.out.print(max);
    }
}
