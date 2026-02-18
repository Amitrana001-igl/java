package PatternPrinting;

import java.util.Scanner;

public class number_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        for(int a=1;a<=n;a++) {
            for (int b=1;b<=n;b++){
                System.out.print((char)(b+64));
            }
            System.out.println(" ");
        }
    }
}

