package PatternPrinting;

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter ur number: ");
        int m = sc.nextInt();
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(j==3 || i==m/2+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
