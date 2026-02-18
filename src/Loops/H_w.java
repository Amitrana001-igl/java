package Loops;
import java.util.Scanner;

public class H_w {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int j =n;
        for(int i=1 ; i<=n; i++){

            System.out.println(i);
            System.out.println(j);
            j--;
        }
    }
}
