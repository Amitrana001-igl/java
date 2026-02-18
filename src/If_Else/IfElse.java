package If_Else;

import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter positive integer: ");
        int a  = sc.nextInt();
        if(a%2==0)
            System.out.println("its even");

        else{
            System.out.print("odd");
        }


    }
}
