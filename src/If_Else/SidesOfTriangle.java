import java.util.Scanner;
public class SidesOfTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter ur 1st integer: ");
        int a = sc.nextInt();
        System.out.print("enter ur 2nd integer: ");
        int b = sc.nextInt();
        System.out.print("enter ur 3rd integer: ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && c+a>b) System.out.print("its a side of triangle");
        else System.out.print("not a side");
    }
}
