//While Loop Problems
// import java.util.*;
// class Main {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int c=0;
//         while(n!=0){
//             n=n/10;
//             c++;
//         }
//         System.out.print("NO OF DIGITS IN THE GIVEN NUMBER: "+c);
//     }
// }

//Reverse the Given Number
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//             int n = sc.nextInt();
//             int d,ans=0;
//             while(n!=0){
//                 d=n%10;
//                 ans= ans*10+d;
//                 n=n/10;
//             }
//             System.out.print("Reverse Number: "+ans);
//     }
// }

//Sum of the Given Number
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int d,sum=0;
//         while(n!=0){
//             d=n%10;
//             sum=sum+d;
//             n=n/10;
//         }
//         System.out.print("Sum of the Given Number: "+sum);
//     }
// }

//Given Number is Palindrome or Not
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int original = n;
//         int d,reverse=0;
//         while(n!=0){
//             d=n%10;
//             reverse = reverse*10+d;
//             n=n/10;
//         }
//         if(original==reverse)
//         System.out.println("Palindrome Number: "+reverse);
//         else
//         System.out.println("Not a Palindrome Number: "+reverse);
//     }
// }

//
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//     }
// }

//Print the primes numbers from given number Range
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int s = sc.nextInt();
//         int e = sc.nextInt();
//         int c;
//         for(int i=s;i<=e;i++){
//             c=0;
//             for(int j=2;j<=i/2;j++){
//                 if(i%j==0){
//                     c++;
//                     break;
//                 }
//             }
//             if(c==0)
//             System.out.print(i+" ");
//         }
//     }
// }

public class Main {
    public static void main(String[] args) {
        System.out.println(7.0 / 2);
    }
}