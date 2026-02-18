package If_Else;

import java.util.Scanner;
public class ProfitOrLoss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER COST PRICE: ");
        int a = sc.nextInt();
        System.out.print("ENTER SELLING PRICE: ");
        int b  = sc.nextInt();
        if(b>a){
            System.out.println("Profit is: "+ (b-a));

        }
        else if(b<a){
            System.out.println("loss is: "+ (a-b));

        }
        else{
            System.out.println("no profit no loss is: "+ (a-b));

        }
    }
}
