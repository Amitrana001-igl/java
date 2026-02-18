import java.util.Scanner;
public class Divisibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("write ur integer: ");
        int x = sc.nextInt();
        if(x%5==0 || x%3==0) System.out.println("divisible");
        else System.out.print("not divisible");


    }
}
