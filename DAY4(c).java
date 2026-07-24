// import java.util.*;
// class Main{
//     public static void main(){
//         Scanner sc =  new Scanner(System.in);
//         int n = sc.nextInt();
//         int row,col;
//         for(row=0;row<n;row++,System.out.println()){
//             for(col=0;col<n;col++)
//             System.out.print(row+1);
//         }
//     }
// }

// import java.util.*;
// class Main{
//     public static void main(){
//         Scanner sc =  new Scanner(System.in);
//         int n = sc.nextInt();
//         int row,col;
//         for(row=0;row<n;row++,System.out.println()){
//             for(col=0;col<n;col++)
//             System.out.print(col+1);
//         }
//     }
// }

// import java.util.*;
// class Main{
//     public static void main(){
//         Scanner sc =  new Scanner(System.in);
//         int n = sc.nextInt();
//         int row,col;
//         for(row=0;row<n;row++,System.out.println()){
//             for(col=0;col<=row;col++)
//             System.out.print(row+1);
//         }
//     }
// }

import java.util.*;
class Main{
    public static void main(){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int row,col,count=1;
        for(row=0;row<n;row++,System.out.println()){
            for(col=0;col<=row;col++)
            System.out.printf("%2d",count++);
        }
    }
}