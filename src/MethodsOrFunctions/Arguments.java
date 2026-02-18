package MethodsOrFunctions;

public class Arguments {
    public static void max(int a, int b, int c){//parameters
        System.out.println(Math.max(Math.max(a,b),c));
    }
    public static void main(String[] args){
        max(5,6,2);//arguments
    }
}
