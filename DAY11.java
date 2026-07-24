//String Problems
//String Length
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int count=0;
//         for(char c:s.toCharArray())
//         count++;
//         System.out.print(count);
//     }
// }

//To count no. of words in given String
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int space=0;
//         for(char c:s.toCharArray()){
//             if(c==' ')
//             space++;
//         }
//         System.out.print(space+1);
        
//     }
// }

//To reverse the given String
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String rev="";
//         int i;
//         for(i=s.length()-1;i>=0;i--)
//         rev = rev+s.charAt(i);
//         System.out.print(rev);
//     }
// }

//to count the no. of vowels in the String
// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String str = sc.nextLine();
//         int count = 0;

//         for (int i = 0; i < str.length(); i++) {
//             char ch = Character.toLowerCase(str.charAt(i));

//             if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                 count++;
//             }
//         }

//         System.out.println("Number of vowels: " + count);
//     }
// }

//count the special characters in given String
// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int count=0;
//         for(char c:s.toCharArray()){
//             if(!((c>='A' &&  c<='Z')||(c>='a' && c<='z')|| (c>='0' && c<='9')))
//             count++;
//         }
//         System.out.print(count);
//     }
// }

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;
        for(char c:s.toCharArray()){
            if(c>='A' && c<='Z')
            c=(char)(c+32);
            else if(c>='a' && c<='z')
            c=(char)(c-32);
        }
        System.out.print(c);
    }
}