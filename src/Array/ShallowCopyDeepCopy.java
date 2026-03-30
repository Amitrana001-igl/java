package Array;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
//        int a = 4; //4 bytes leta hai ye
        int[] arr = {1,2,4,4}; // 16 byte
//        int[] x = arr; // x is a shallow copy of arr
//        x[0] = 100;
//        System.out.print(x[0]);

        int[] deep = Arrays.copyOf(arr,arr.length); // deep copy
        deep[0] = 100;
        System.out.print(arr[0]);
    }
}
