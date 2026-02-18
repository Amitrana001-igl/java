package If_Else;

import java.util.Scanner;
public class IntegerOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a real number: ");
        double n = sc.nextDouble();
//        if(n%1==0)   System.out.print("integer");
//        else System.out.print("not integer");
        /*........2nd logic......*/

        int x  = (int)n;
        if(n -x>0) System.out.print("not integer");
        else System.out.print(" integer"); /* this fails for negative numbers */

    }
}
