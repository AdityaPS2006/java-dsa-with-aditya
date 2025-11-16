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


    // public static boolean isPrime(int n){
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }


    
    // public static boolean isPrime(int n){
    //     if(n==2){
    //         return true;
    //     }
    //     for(int i=2;i<=Math.sqrt(n);i++){
    //         if(n%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static void primesInRange(int n){
    //     for(int i=2;i<=n;i++){
    //         if(isPrime(i)){//true
    //             System.out.print(i+" ");
    //         }
    //     }
    // }


    // public static void binaryToDecimal(int n){
    //     int pow=0;
    //     int dec=0;
    //     while(n>0){
    //         int lastDigit=n%10;
    //         dec=dec+(int)(lastDigit*Math.pow(2,pow));
    //         pow++;
    //         n=n/10;
    //     }
    //     System.out.println(dec);
    // }


    // public static void decimalToBinary(int n){
    //     int pow=0;
    //     int bin=0;
    //     while(n>0){
    //         int rem=n%2;
    //         bin=bin+(rem*(int)Math.pow(10,pow));
    //         pow++;
    //         n=n/2;
    //     }
    //     System.out.println(bin);
    // }

    //FUNCTIONS AND METHODS:PRATICE QUESTION
    // public static void getAvg(int a,int b,int c){
    //     int sum=a+b+c;
    //     System.out.println(sum);
    // }
       
    // public static boolean isEven(int n){
    //     if(n%2==0){
    //         return true;
    //     }else{
    //         return false;
    //     }
    // }


    // public static void isPallindrome(int n){
    //     int x=n;
    //     int rev=0;
    //     while(n>0){
    //         int lastDigit=n%10;
    //         rev=rev*10+lastDigit;
    //         n=n/10;
    //     }
    //     if(x==rev){
    //         System.out.println("Pallindrome number");
    //     }else{
    //         System.out.println("Not a Pallindrome number");
    //     }
    // }

    
    public static void sum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println(sum);
    }
      public static void main(String[] args) {
      sum(4444);
    }
}
