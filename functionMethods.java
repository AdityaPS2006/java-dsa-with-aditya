import java.util.*;
public class functionMethods {
    // public static void printHelloWorld(){
    //     System.out.println("Hello World");
    //     System.out.println("Hello World2");
    //     System.out.println("Hello World3");
    // }



    // public static int printHelloWorld(){
    //     System.out.println("Hello World 1");
    //     System.out.println("Hello World 2");
    //     System.out.println("Hello World 3");
    //     return 3;   
    // }

     
    //    public static int sum(int num1,int num2){
    //     return num1+num2;
    //    }


    // public static void sum(int a,int b){
    //     System.out.println(a+b);
    // }


    // public static void changeA(int a){
    //     a=10;
    // }


    // public static int mult(int a,int b){
    //     int mult=a*b;
    //     return mult;
    // }

    // public static int fact(int n){
    //     int fac=1;
    //     for(int i=1;i<=n;i++){
    //         fac*=i;
    //     }
    //     return fac;
    // }
    // public static int binCofficient(int n,int r){
    //     int n_fact=fact(n);
    //     int r_fact=fact(r);
    //     int nmr_fact=fact(n-r);
    //     int BC=n_fact/(r_fact*nmr_fact);
    //     return BC;
    // }


    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }

      
    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // public static float sum(float a,float b){
    //     return a+b;
    // }


    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       System.out.println(isPrime(13));
    }
}
