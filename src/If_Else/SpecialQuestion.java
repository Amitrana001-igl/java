package If_Else;

import java.util.Scanner;
public class SpecialQuestion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter ur number: ");
        int n = sc.nextInt();
        if (n % 3 == 0 && n % 5 == 0) {
            System.out.print("Aporva");
        }
        else if (n % 5 == 0) {
            System.out.print("RIYA");
        }
        else if (n % 3 == 0) {
            System.out.print("Banu");
        }
        else {
            System.out.print("Isha");
        }


    }

}
