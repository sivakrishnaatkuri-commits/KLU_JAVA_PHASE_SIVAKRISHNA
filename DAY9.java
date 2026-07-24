//Swaping of two numbers without using third variable
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println("Before Swap: "+a+" "+b);
//         a=a+b;
//         b=a-b;
//         a=a-b;
//         System.out.println("After Swap: "+a+" "+b);
//     }
// }

//Swaping of the numbers with pairs
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n-1;i++){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            
        }
        for(i=0;i<n;i++)
        System.out.print(arr[i]+ " ");
    }
}