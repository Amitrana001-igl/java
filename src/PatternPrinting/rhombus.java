package PatternPrinting;

import java.util.Scanner;

public class rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
        int nsp = n-1, nst = n;


//        for(int  i=1;i<=n;i++){
//            for( int j=1;j<=n-i;j++){
//                System.out.print("  ");
//            }
//            for(int j=1;j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
        for(int  i=1;i<=n;i++){
            for( int j=1;j<=nsp;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nsp--;
            System.out.println();

        }
    }
}
