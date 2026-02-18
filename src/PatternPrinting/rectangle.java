package PatternPrinting;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int row= sc.nextInt();
        System.out.print("enter a number: ");
        int col= sc.nextInt();



        for(int a=1;a<=row;a++){ //kitni line print hongi
            for(int b =1;b<=col;b++){//kitne stars print honge
                System.out.print("* ");
            }
            System.out.println();


        }

    }
}
