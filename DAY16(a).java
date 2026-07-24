//  class Stack
// {
//     int top;
//     int arr[];
//     int size;

//     Stack(int n)
//     {
//         this.top = -1;
//         this.size = n;
//         arr = new int[n];
//     }

//     void push(int d)
//     {
//         if(top == size - 1)
//         {
//             System.out.println("Stack overflow");
//         }
//         else
//         {
//             arr[++top] = d;
//             System.out.println(arr[top]);
//         }
//     }

//     void pop()
//     {
//         if(top == -1)
//         {
//             System.out.println("Stack Underflow");
//         }
//         else
//         {
//             System.out.println(arr[top]);
//             top--;
//         }
//     }

//     void peek()
//     {
//         if(top == -1)
//         {
//             System.out.println("Stack underflow");
//         }
//         else
//         {
//             System.out.println(arr[top]);
//         }
//     }

//     void display()
//     {
//         if(top == -1)
//         {
//             System.out.println("Stack underflow");
//         }
//         else
//         {
//             for(int i = top; i >= 0; i--)
//             {
//                 System.out.print(arr[i] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Main
// {
//     public static void main(String[] args)
//     {
//         Stack s = new Stack();
//       Scanner sc = new Scannner(System.in);
//       int choice = sc.nextInt();
//       while(true)
//       {
//           switch(choice){
//               System.out.println("1.push");
//               System.out.println("2.pop");
//               System.out.println("3.peek");
//               System.out.println("4.display");
//               System.out.println("5.Exit");
//               System.out.println("Enter your choice: ");
//               int choice = sc.nextInt();
//               switch (choice)
//               {
//                   case 1:
//                       System.out.print("Enter value to push: ");
//                       int d = sc.nextInt();
//                       s.push(d);
//                       break;
//                     case 2:
//                         s.pop();
//                         break;
//                     case 3:
//                         s.peek();
//                         break;
//                     case 4:
//                         s.display();
//                         break;
//                     case 5:
//                         return;
//                     default:
//                         System.out.println("Invalid");
//           }
//       }
//     }
// }

import java.util.*;
