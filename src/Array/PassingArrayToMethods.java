package Array;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] x = {2,42,4,22,19};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] y){
        y[2] = 33;
    }
}
