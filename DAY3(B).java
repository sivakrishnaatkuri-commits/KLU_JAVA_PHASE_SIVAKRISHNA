/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// import java.util.*;
// class Main
// {
// 	public static void main(String[] args) {
// 	    Scanner sc = new Scanner(System.in);
// 	    int n = sc.nextInt();
// 		int i,sum=0;
// 		for (i=1;i<n;i++)
// 		sum+=i;
// 		System.out.print("Sum of "+n+" natural numbers: "+sum);
// 	}
// }

// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int i;
//         for(i=1;i<n;i++){
//             if(n%i==0)
//             System.out.print(i+" ");
//         }
//         System.out.print(n);
//     }
// }

// import java.util.*;
// class Main{
//     public static void main(){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int fact=1,i;
//         for (i=1;i<=n;i++)
//         fact=fact*i;
//         System.out.print("Factorial of"+n+":"+fact);
//     }
// }

// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in){
//         int n = sc.nextInt();
//         int i;
//         for (i=1;i<10;i++)
//         System.out.println();
//         }
//     }
// }

import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();
        int i,c=0;
        for (i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                c++;
                System.out.print("Not a prime Number");
            }
        }
    }
}
