import java.util.*;
public class random1{
                                          //SECTION-A
    //1
    public static void isEven(int n){
       if(n%2==0){
        System.out.print("Even number");
       }else{
        System.out.print("Not Even number");
       }
    }
    
    //2
    public static void isOdd(int n){
        if(n%3==0){
            System.out.print("Odd number");
        }else{
            System.out.println("Not odd number");
        }
    }
    
    //3
    public static int lastDigit(int n){
        int x=n%10;
        return x;
    }


    //4
    public static int secondLast(int n){//765498
        int  y=n%100;//98
        int z=y/10;//9
        return z;
    }

    //5
    public static int sum(int n,int m){
        int x=n%10;
        int y=m%10;
        int z=x+y;
        return z;
    }


    //6
    public static void multiple(int n,int m){
        if(n%m==0){
            System.out.print(n+" is exact multiple of "+m);
        }else{
            System.out.println(n+" is not exact multiple of "+m);
        }
    }

    //7
    public static int evenNo(int arr[]){
        int totalEven=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                totalEven+=1;
            }
        }
        return totalEven;
    }


    //8
    public static int oddNo(int arr[]){
        int totalOdd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                totalOdd+=1;
            }
        }
        return totalOdd;
    }

    
    //9
    public static void oddEven(int arr[]){
        int totalOdd=0;
        int totalEven=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                totalEven+=1;
            }else{
                totalOdd+=1;
            }
        }
        System.out.println("Total even:"+totalEven);
        System.out.println("Total odd:"+totalOdd);
    }


                                          //SECTION-B
    //1
    public static void isPrime(int n){
         if(n<=1){
            System.out.println("Not a prime number");
            return;
         }

         if(n==2){
            System.out.println("Prime number");
            return;
         }
         boolean flag=true;
         for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){         
               flag=false;
            }
         }
         if(flag){
            System.out.println("Prime number");
         }else{
            System.out.println("Not a prime number");
         }
    }

    
    //2
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }


    //3
    public static void fibonacci(int n){
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }


    //4
    // public static boolean prime(int n){
    //     if(n<=1){
    //         return false;
    //     }

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
    // public static int nthPrime(int n){
    //     int count=0;
    //     int num=2;
    //     while(true){
    //         if(prime(num)){
    //             count++;
    //         }
    //         if(count==n){
    //         return num;
    //     }
    //     num++;
    //     }
    // }



    public static boolean prime(int n){
        if(n<=1){
            return false;
        }if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int nthPrime(int n){
        int count=0;
        int num=2;
        while(true){
            if(prime(num)){
                count++;
            }
            if(n==count){
                return num;
            }
            num++;
        }
    }
    

    //5
    public static int countPrimeNumbers(int L,int R){
        int count=0;
        for(int i=L;i<=R;i++){
            if(prime(i)){
                count++;
            }
        }
        return count;
    } 
        
    
    //6
    public static int allDigit(int n){
        if(n==0){
            return 1;
        }
        n=Math.abs(n);
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }


    //7
    public static int uniqueNumber(int n){
        n=Math.abs(n);
        int unique=0;
        int freq[]=new int[10];
        while(n>0){
            int rem=n%10;
            if(freq[rem]==0){
                unique+=1;
                freq[rem]=1;
            }
            n/=10;
        }
        return unique;
    }

    //8
    public static int nonRepeated(int n){
        n=Math.abs(n);
        int count=0;
        int freq[]=new int[10];
        while(n>0){
            int rem=n%10;
            freq[rem]+=1;
            n/=10;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1){
                count+=1;
            }
        }return count;
    }

     
    //9
    public static int sum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }


    //10
    public static int evenSum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            if(rem%2==0){
                sum+=rem;
            }
            n/=10;
        }
        return sum;
    }


    //11
   public static int oddSum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            if(rem%2!=0){
                sum+=rem;
            }
            n/=10;
        }
        return sum;
    } 


    //12
    public static int digitSumOpt(int n,boolean even){
        int sum=0;
        while(n>0){
            int rem=n%10;
            if(even && rem%2==0){
                sum+=rem;
            }
            else if(!even && rem%2!=0){
                sum+=rem;
            }
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int m=sc.nextInt();
        // multiple(n,m);
        // int arr[]=new int[5];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }
        // oddEven(arr);
        // isPrime(1);
        // System.out.println(factorial(5));
        // fibonacci(5);
        // System.out.println(nthPrime(6));
        // System.out.println(countPrimeNumbers(10,30));
        // System.out.println(allDigit(126699978));
        System.out.println(digitSumOpt(567982855,true));
    }
}