package Loops;

import java.util.Scanner;

public class Ap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = 99, d = 4;

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a -= d;
        }
    }
}
