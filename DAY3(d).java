//Number of prime Numbers count in a given Number
// import java.util.*;
// class  Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int d,c=0;
//         while(n!=0){
//             d=n%10;
//         if(d==2||d==3||d==5||d==7)
//         c++;
//         n=n/10;
//         }
//         System.out.print(c);
//     }
// }

//perfect Number
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum=0;
//         for(int i=1;i<=n/2;i++){
//             if(n%i==0)
//             sum += i;
//         }
//         if(sum==n){
//             System.out.println("Perfect Number");
//         }
//         else{
//             System.out.println("Not a Perfect Number");
//         }
        
//     }
// }

// Strong Number
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int temp=0;
//         int d,i,fact,sum=0;
//         while(n!=0)
//         {
//             d=n%10;
//             fact=1;
//             for(i=1;i<=d;i++){
//                 fact = fact*i;
//             }
//             sum = sum+fact;
//             n=n/10;
//         }
//         if(sum==temp){
//             System.out.println("Strong Number");
//         }
//         else{
//             System.out.println("Not a Strong Number");
//         }
        
//     }
// }

//Adams Number
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int d,sr,rev=0;
//         sr = n*n;
//         while(n!=0)
//         {
//             d=n%10;
//             rev = rev*10+d;
//             n=n/10;
//         }
//         int srn = rev*rev;
//         int ans=0;
//         while(srn!=0){
//             d=srn%10;
//             ans = ans*10+d;
//             srn = srn/10;
//         }
//         if(ans==sr)
//         System.out.println("Adam Number");
//         else
//         System.out.print("Not an Adam Number");
        
//     }
// }

//
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum1=0,sum2=0,i;
        for(i=1;i<=n1-1;i++){
            if(n1%i=0)
            sum1=sum1+i;
        }
        for(n2%i=0) 
        
    }
}