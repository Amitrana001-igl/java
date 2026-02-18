package Loops;

import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int rev=0;
        int a;
        while(n!=0){
            a = n%10;
            rev = rev*10+a;
            n/=10;

        }
        System.out.print(rev);
    }
}
