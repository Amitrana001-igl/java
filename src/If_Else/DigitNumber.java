import java.util.Scanner;
public class DigitNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter ur number: ");
        int n = sc.nextInt();

        if(n>999 && n<10000) System.out.print("number is four digit");
        else System.out.print("number is not four digit");

    }
}
