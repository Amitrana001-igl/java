package Array;

import java.util.Scanner;

public class OutputAndInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int[] arr = {3,6,-2,-9,3,5,54,65,5,5};
//        int n =arr.length;
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
     int[] amit = new int[7];
     for(int i =0;i<7;i++){
         amit[i] = sc.nextInt();
     }
     for(int i = 0; i<7;i++){
         System.out.print(amit[i]*2+ " ");
     }
    }
}
