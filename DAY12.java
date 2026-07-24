//Tale Recursion
// import java.util.*;
// class Main{
//     static void fun(int n){
//         if(n>0){
//             System.out.println(n);
//             fun(n-1);
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         fun(n);
//     }
// }

//Head Recursion
// import java.util.*;
// class Main{
//     static void fun(int n){
//         if(n>0){
//             fun(n-1);
//             System.out.print(n);
//             System.out.println(n+1);
//         }
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         fun(n);
//     }
// }

// Linear Recursion
// import java.util.*;
// class Main{
//     static int fact(int n){
//         if(n==0 || n==1)
//          return 1;
//         return n*fact(n-1);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int ans=fact(n);
//         System.out.println(ans);
//     }
// }

//Nested Recursion
// import java.util.*;

// class Main {
//     static int fun(int n) {
//         if (n > 100)
//             return n - 10;
//         return fun(fun(n + 11));
//     }

//     public static void main(String[] args) {
//         int ans = fun(98);
//         System.out.println(ans);
//     }
// }