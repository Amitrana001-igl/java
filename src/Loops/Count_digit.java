package Loops;
import java.util.Scanner;

public class Count_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter ur number: ");
        int n = sc.nextInt();
        int count = 0;
//         for(;n!=0;n/=10){
//             count++;
//         }
//         System.out.print(count);
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.print(count);
    }
}
