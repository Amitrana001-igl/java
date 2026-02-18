package MethodsOrFunctions;

public class PassByValueAndRefrence {
    public static void change(int x){
        if(x==10) System.out.println(20);
        else
            System.out.println(0);

    }
    public static void main(String[] args){
        int x = 10;
        System.out.println(x);
        change(x);
        System.out.println(x);

    }
}
