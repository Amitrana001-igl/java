package MethodsOrFunctions;
import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        System.out.print("Enter a number: ");
        int c = sc.nextInt();
        System.out.print("Enter a number: ");
        int d = sc.nextInt();
        System.out.println(Math.max(Math.max(a, b), Math.max(c, d)));
    }
}
