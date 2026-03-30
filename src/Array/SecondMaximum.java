package Array;

public class SecondMaximum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>max) max= arr[i];

        }

        for(int i=0;i<n;i++){
            if(arr[i]>smax && arr[i]!=max) smax= arr[i];

        }
        System.out.println(max);
        System.out.print(smax);

    }
}
