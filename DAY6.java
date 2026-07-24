// import java.util.Scanner;

// public class SumOfDigits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int sum = 0;

//         while (num > 0) {
//             sum = sum + num % 10;
//             num = num / 10;
//         }

//         System.out.println("Sum of Digits = " + sum);
//     }
// }

// import java.util.Scanner;

// public class ReverseNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int rev = 0;

//         while (num > 0) {
//             rev = rev * 10 + num % 10;
//             num = num / 10;
//         }

//         System.out.println("Reverse = " + rev);
//     }
// }

// import java.util.Scanner;

// public class CountDigits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int count = 0;

//         while (num > 0) {
//             count++;
//             num = num / 10;
//         }

//         System.out.println("Number of Digits = " + count);
//     }
// }

// import java.util.Scanner;

// public class PalindromeNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int temp = num;
//         int rev = 0;

//         while (num > 0) {
//             rev = rev * 10 + num % 10;
//             num = num / 10;
//         }

//         if (temp == rev)
//             System.out.println("Palindrome Number");
//         else
//             System.out.println("Not a Palindrome Number");
//     }
// }