
// import java.util.Scanner;

// public class AmicablePair {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int n1 = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int n2 = sc.nextInt();

//         int sum1 = 0, sum2 = 0;

//         for (int i = 1; i < n1; i++) {
//             if (n1 % i == 0)
//                 sum1 += i;
//         }

//         for (int i = 1; i < n2; i++) {
//             if (n2 % i == 0)
//                 sum2 += i;
//         }

//         if (sum1 == n2 && sum2 == n1)
//             System.out.println("Amicable Pair");
//         else
//             System.out.println("Not an Amicable Pair");
//     }
// }


// import java.util.Scanner;

// public class StrongNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         int temp = n, sum = 0;

//         while (temp > 0) {
//             int rem = temp % 10;
//             int fact = 1;

//             for (int i = 1; i <= rem; i++) {
//                 fact *= i;
//             }

//             sum += fact;
//             temp /= 10;
//         }

//         if (sum == n)
//             System.out.println("Strong Number");
//         else
//             System.out.println("Not a Strong Number");
//     }
// }

// import java.util.Scanner;

// public class PerfectNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         int sum = 0;

//         for (int i = 1; i < n; i++) {
//             if (n % i == 0)
//                 sum += i;
//         }

//         if (sum == n)
//             System.out.println("Perfect Number");
//         else
//             System.out.println("Not a Perfect Number");
//     }
// }

// import java.util.Scanner;

// public class HarshadNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         int temp = n, sum = 0;

//         while (temp > 0) {
//             sum += temp % 10;
//             temp /= 10;
//         }

//         if (n % sum == 0)
//             System.out.println("Harshad Number");
//         else
//             System.out.println("Not a Harshad Number");
//     }
// }

// import java.util.Scanner;

// public class NeonNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         int square = n * n;
//         int sum = 0;

//         while (square > 0) {
//             sum += square % 10;
//             square /= 10;
//         }

//         if (sum == n)
//             System.out.println("Neon Number");
//         else
//             System.out.println("Not a Neon Number");
//     }
// }