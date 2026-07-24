// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int d)
//     {
//         this.data=d;
//         this.next=null;
//     }
// }
// class Main{
//     Node first;
//     void insert(int d)
//     {
//         Node n = new Node(d);
//         if(first==null){
//             first =n;
//             return ;
//         }
//         else{
//             Node temp=first;
//             while(temp.next!=null){
//                 temp=temp.next;
//             }
//             temp.next=n;
//         }
//     }
//     void display(){
        
//         if(first==null){
//             System.out.println("Linked list is empty");
//             return;
//         }
//       Node temp=first;
//             while(temp!=null)
//             {
//                 System.out.print(temp.data+" ");
//                 temp=temp.next;
//             }
//         }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int d = sc.nextInt();
//         Main m = new Main();
//         while(d!=-1){
//             m.insert(d);
//             d=sc.nextInt();
//         }
//         m.display();
//     }
// }

//Sum of the elements in the Linked List
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int d)
//     {
//         this.data=d;
//         this.next=null;
//     }
// }
// class Main{
//     Node first;
//     void insert(int d)
//     {
//         Node n = new Node(d);
//         if(first==null){
//             first =n;
//             return ;
//         }
//         else{
//             Node temp=first;
//             while(temp.next!=null){
//                 temp=temp.next;
//             }
//             temp.next=n;
//         }
//     }
//     void sumelements(){
//         int sum=0;
//         if(first==null){
//             System.out.println("Linked list is empty");
//             return;
//         }
//       Node temp=first;
//             while(temp!=null)
//             {
//                 sum+=temp.data;
//                 temp=temp.next;
//             }
//             System.out.print(sum);
//         }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int d = sc.nextInt();
//         Main m = new Main();
//         while(d!=-1){
//             m.insert(d);
//             d=sc.nextInt();
//         }
//         m.sumelements();
//     }
// }

//Find the maximum element in the Linked list
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int d)
//     {
//         this.data=d;
//         this.next=null;
//     }
// }
// class Main{
//     Node first;
//     void insert(int d)
//     {
//         Node n = new Node(d);
//         if(first==null){
//             first =n;
//             return ;
//         }
//         else{
//             Node temp=first;
//             while(temp.next!=null){
//                 temp=temp.next;
//             }
//             temp.next=n;
//         }
//     }
//     void maxele(){
//         int max=Integer.MIN_VALUE;
//         if(first==null){
//             System.out.println("Linked list is empty");
//             return;
//         }
//       Node temp=first;
//             while(temp!=null)
//             {
//               if (temp.data > max) {
//                 max = temp.data;
//             }
//                 temp=temp.next;
//             }
//             System.out.print(max);
//         }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int d = sc.nextInt();
//         Main m = new Main();
//         while(d!=-1){
//             m.insert(d);
//             d=sc.nextInt();
//         }
//         m.maxele();
//     }
// }

//Find the Minimum Value in the Linked List
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int d)
//     {
//         this.data=d;
//         this.next=null;
//     }
// }
// class Main{
//     Node first;
//     void insert(int d)
//     {
//         Node n = new Node(d);
//         if(first==null){
//             first =n;
//             return ;
//         }
//         else{
//             Node temp=first;
//             while(temp.next!=null){
//                 temp=temp.next;
//             }
//             temp.next=n;
//         }
//     }
//     void minele(){
//         int min=Integer.MAX_VALUE;
//         if(first==null){
//             System.out.println("Linked list is empty");
//             return;
//         }
//       Node temp=first;
//             while(temp!=null)
//             {
//               if (temp.data < min) {
//                 min = temp.data;
//             }
//                 temp=temp.next;
//             }
//             System.out.print(min);
//         }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int d = sc.nextInt();
//         Main m = new Main();
//         while(d!=-1){
//             m.insert(d);
//             d=sc.nextInt();
//         }
//         m.minele();
//     }
// }


//Average of the elements in the Linked list
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int d)
//     {
//         this.data=d;
//         this.next=null;
//     }
// }
// class Main{
//     Node first;
//     void insert(int d)
//     {
//         Node n = new Node(d);
//         if(first==null){
//             first =n;
//             return ;
//         }
//         else{
//             Node temp=first;
//             while(temp.next!=null){
//                 temp=temp.next;
//             }
//             temp.next=n;
//         }
//     }
//     void Average(){
//         int sum=0, count=0;
//         if(first==null){
//             System.out.println("Linked list is empty");
//             return;
//         }
//       Node temp=first;
//             while(temp!=null)
//             {
//               sum+=temp.data;
//               count++;
//                 temp=temp.next;
//             }
//             double avg = (double) sum/count;
//             System.out.print(avg);
//         }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int d = sc.nextInt();
//         Main m = new Main();
//         while(d!=-1){
//             m.insert(d);
//             d=sc.nextInt();
//         }
//         m.Average();
//     }
// }

//Insert an element at any position in Singly Linked List
// import java.util.*;

// class Node{
//     int data;
//     Node next;

//     Node(int d){
//         this.data = d;
//         this.next = null;
//     }
// }

// class Main{
//     Node first;

//     void insert(int d){
//         Node n = new Node(d);

//         if(first == null){
//             first = n;
//             return;
//         }

//         Node temp = first;
//         while(temp.next != null){
//             temp = temp.next;
//         }
//         temp.next = n;
//     }

//     void insertAtPosition(int pos, int d){
//         Node n = new Node(d);

//         if(pos == 1){
//             n.next = first;
//             first = n;
//             return;
//         }

//         Node temp = first;

//         for(int i = 1; i < pos-1 && temp != null; i++){
//             temp = temp.next;
//         }

//         if(temp == null){
//             System.out.println("Invalid Position");
//             return;
//         }

//         n.next = temp.next;
//         temp.next = n;
//     }

//     void display(){
//         if(first == null){
//             System.out.println("Linked List is Empty");
//             return;
//         }

//         Node temp = first;
//         while(temp != null){
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         Main m = new Main();

//         int d = sc.nextInt();

//         while(d != -1){
//             m.insert(d);
//             d = sc.nextInt();
//         }

//         int pos = sc.nextInt();
//         int value = sc.nextInt();

//         m.insertAtPosition(pos, value);

//         m.display();
//     }
// }

//Double Linked List Craetion
import java.util.*;
class Node{
    int data;
    Node prev;
    Node next;
    Node(int d)
    {
        this.data=d;
        this.next=null;
        this.prev=null;
    }
}
class Main{
    Node first;
    void insert(int d)
    {
        Node n = new Node(d);
        if(first==null){
            first =n;
            return ;
        }
        else{
            Node temp=first;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
            n.prev=temp;
        }
    }
    void display(){
        
        if(first==null){
            System.out.println("Linked list is empty");
            return;
        }
      Node temp=first;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        Main m = new Main();
        while(d!=-1){ 
            m.insert(d);
            d=sc.nextInt();
        }
        m.display();
    }
}