package Loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
//        int a=1;
//
//        while(n!=0){
//            a = a*n;
//            n--;
//        }
//        System.out.print(a);
        for(int i =1;i<=n;i++){
            fact*=i;
        }
        System.out.print(fact);
    }
}
