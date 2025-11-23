import java.util.*;
public class arrays1 {
    //  public static int[] update(int marks[],int x){
    //     x+=1;
    //     for(int i=0;i<marks.length;i++){
    //         marks[i]+=1;
    //     }
    //     return marks;
    //  }
    


    // public static int linearSearch(String numbers[],String key){
    //     for(int i=0;i<numbers.length;i++){
    //         if(numbers[i]==key){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }


    // public static int getLargest(int num[]){
    //     int largest=Integer.MIN_VALUE;
    //     int smallest=Integer.MAX_VALUE;
    //     for(int i=0;i<num.length;i++){
    //         if(largest<num[i]){
    //              largest=num[i];
    //         }
    //         if(smallest>num[i]){
    //             smallest=num[i];
    //         }
    //     }
    //     System.out.println("Smallest value:"+smallest);
    //     return largest;
    // }


    // public static int binarySearch(int nums[],int key){
    //     int start=0;
    //     int end=nums.length-1;
    //     while(start<=end){
    //         int mid=(start+end)/2;
    //         if(nums[mid]==key){
    //             return mid;
    //         }
    //         if(nums[mid]<key){
    //             start=mid+1;
    //         }
    //         else{
    //             end=mid-1;
    //         }
    //     }
    //     return -1;
    // }


//    public static void reverse(int nums[]){
//       int start=0;
//       int end=nums.length-1;
//       while(start<end){
//         int temp=nums[start];
//         nums[start]=nums[end];
//         nums[end]=temp;
//         start++;
//         end--;
//       }
//    }


// public static void pairs(int arr[]){
//     int pairs=0;
//     for(int i=0;i<arr.length;i++){
//         int curr=arr[i];
//         for(int j=i+1;j<arr.length;j++){
//             System.out.print("("+curr+","+arr[j]+")");
//             pairs++;
//         }
//         System.out.println();
//     }
//     System.out.println(pairs);
// }


public static void subArray(int nums[]){
    int tp=0;
    for(int i=0;i<nums.length;i++){
        for(int j=i;j<nums.length;j++){
            for(int k=i;k<=j;k++){
                System.out.print(nums[k]);
            }
            tp++;
            System.out.println();
        }
        System.out.println();
    }
    System.out.println(tp);
}
    public static void main(String[] args) {

                       //create of an array
        //  int x[]=new int[50];
        //  System.out.println(x.length);

        // String fruits[]={"apple","banana","mango","grapes"};
        // for(int i=0;i<fruits.length;i++){
        //     System.out.print(fruits[i]+" ");
        // }


                        //input,output,update of an array
        // int marks[]=new int[4];
        // Scanner sc=new Scanner(System.in);
        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();
        // marks[3]=sc.nextInt();
        // // for(int i=0;i<marks.length;i++){
        // //     System.out.println(marks[i]);
        // // }
        // marks[1]=marks[1]+1;
        // System.out.println("phy:"+marks[0]);
        // System.out.println("chem:"+marks[1]);
        // System.out.println("maths:"+marks[2]);
        // System.out.println("eng:"+marks[3]);
        // int percentage=(marks[0]+marks[1]+marks[2]+marks[3])/4;
        // System.out.println(percentage+"%");
        // System.out.print("Length of the array:"+marks.length);


                        //passing arrays as arguments
        // int marks[]={98,88,96};
        // int x=50;
        // update(marks,x);
        // for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i]+" ");
        // }
        // System.out.println(x);

        // int numbers[]={2,4,6,8,10,12,14,16};
        // int key=10;
        // int idx=linearSearch(numbers,key);
        // if(idx==-1){
        //     System.out.println("NOT FOUND");
        // }else{
        //     System.out.print("Index is:"+idx);
        // }

        // String menu[]={"Dosa","Chole Bhature","Samosa"};
        // String key="Samosa";
        // int idx=linearSearch(menu,key);
        // if(idx==-1){
        //     System.out.println("NOT FOUND");
        // }else{
        //     System.out.println(idx);
        // }


        // int num[]={1,2,6,3,5};
        // int largest=getLargest(num);
        // System.out.println("Largest number:"+largest);

        // int nums[]={2,4,6,8,10,12,14};
        // int key=20;
        // System.out.println(binarySearch(nums,key));


        // int nums[]={2,4,6,8,10};
        // reverse(nums);
        // for(int i=0;i<nums.length;i++){
        //     System.out.println("value for "+i+" : "+nums[i]);
        // }


        int nums[]={2,4,6,8,10};
        subArray(nums);
    }
}
