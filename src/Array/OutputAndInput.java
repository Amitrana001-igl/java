package Array;

import java.util.Scanner;

public class OutputAndInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int[] arr = {5,-4,4,-2,-5,8};
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }

        int[] Amit = new int[7];
        for(int i=0;i< Amit.length;i++){
            Amit[i] = sc.nextInt();

        }
        for(int i =0;i<Amit.length;i++){
            System.out.print(Amit[i]*2+ " ");
        }
    }
}
