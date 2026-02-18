package PatternPrinting;

import java.util.Scanner;

public class number_square2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
