package Loops;
import java.util.Scanner;
public class composite {

    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter ur number: ");
        int n = sc.nextInt();
        boolean flag =true; //true means prime

//        for(int i=2;i<=n-1;i++) {
//            if (n % i == 0) {//'i' to 'n' ka factor nikla
//                flag = false;
//
//                break;//break hojayega jb 1st time koi factor mill jayega aage jayega he ni
//
//            }
//        }
//
//        if(flag==true) System.out.println("Prime number");

        /*............2nd method.........*/
        for(int i=2;i<=Math.sqrt(n);i++) {
            if (n % i == 0) {//'i' to 'n' ka factor nikla
                flag = false;

                break;//break hojayega jb 1st time koi factor mill jayega aage jayega he ni

            }
        }

        if(flag==true) System.out.println("Prime number");
        else if(n==1) System.out.println("not prime nor composite");
        else System.out.print("composite number");




    }
}
