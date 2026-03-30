package Array;

import java.util.Scanner;

public class MultiplyOddIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur array size: ");
        int x = sc.nextInt();

        int[] arr = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        A(arr);


    }
    public static void A(int[] arr){

        for(int i=0;i<arr.length;i++){
            if(i%2!=0){
                System.out.print(arr[i]*2 +" ");
            }
            else{
                System.out.print(arr[i]+10 + " ");
            }
        }
    }
}
