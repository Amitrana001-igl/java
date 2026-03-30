package Array;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {4,5,32,34,21,54};
        int target =34;
        boolean flag = false;// false means element array mai nhi hai
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.print("Target exist in array at Index" + " "+i);
                flag = true;
                break;
            }
        }
        if(!flag ) System.out.print("Target is missing in array");


    }
}
