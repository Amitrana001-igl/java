package Array;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = {1,5,8,-3};
        int target = 2;

        System.out.print(Static(arr,target));
    }

    public static  boolean Static(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}