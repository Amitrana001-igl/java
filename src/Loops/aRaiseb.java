package Loops;

import java.util.Scanner;

public class aRaiseb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number a: ");
        int a = sc.nextInt();
        System.out.print("enter a number b: ");
        int b= sc.nextInt();
        int p = 1;
        for(int i=1;i<=b;i++){
            p*=a;
        }
        System.out.print(p);

    }
}
