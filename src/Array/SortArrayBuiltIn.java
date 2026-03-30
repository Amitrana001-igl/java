package Array;

import java.util.Arrays;

public class SortArrayBuiltIn {
    public static void main(String[] args) {
        // sort ascending order
        int[] arr = {3,6,5,4,2};
        print(arr);// arr is passed in print function
        Arrays.sort(arr); // sorting arrays
        print(arr);

    }
    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
