//Circular single Linked list
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int d){
//         this.data=d;
//         this.next=null;
//     }
// }
// class Main{
//     Node first;
//     void insert (int d){
//         Node n = new Node(d);
//         if(first == null){
//             first=n;
//             n.next=first;
//         }
//         else{
//             Node temp=first;
//             while(temp.next!=first){
//                 temp=temp.next;
//             }
//             temp.next=n;
//             n.next=first;
//         }
//     }
//     void display()
//     {
//       if(first==null){
//           System.out.println("Lisked list is Empty");
//           return;
//       }
//       Node temp=first;
//       do{
//           System.out.print(temp.data+" ");
//           temp=temp.next;
//       }while(temp!=first);
//     }
//     public static void main(String[] args){
//         Scanner obj = new Scanner(System.in);
//         int d = obj.nextInt();
//         Main m = new Main();
//         while(d!=-1){
//             m.insert(d);
//             d=obj.nextInt();
//         }
//         m.display();
//     }
// }

//Sum of the elements in the circular linked list
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node(int d){
//         this.data=d;
//         this.next=null;
//     }
// }
// class Main{
//     Node first;
//     void insert (int d){
//         Node n = new Node(d);
//         if(first == null){
//             first=n;
//             n.next=first;
//         }
//         else{
//             Node temp=first;
//             while(temp.next!=first){
//                 temp=temp.next;
//             }
//             temp.next=n;
//             n.next=first;
//         }
//     }
//     void sumele()
//     {
//       if(first==null){
//           System.out.println("Lisked list is Empty");
//           return;
//       }
//       Node temp=first;
//       int sum=0;
//       do{
//           sum=sum+temp.data;
//           temp=temp.next;
//       }while(temp!=first);
//       System.out.print(sum);
//     }
//     public static void main(String[] args){
//         Scanner obj = new Scanner(System.in);
//         int d = obj.nextInt();
//         Main m = new Main();
//         while(d!=-1){
//             m.insert(d);
//             d=obj.nextInt();
//         }
//         m.sumele();
//     }
// }


//Number of songs to play based on the Song id's 
// import java.util.*;
// class Node{
//     int data;
//     Node next;
//     Node (int d){
//         this.data=d;
//         this.next=null;
//     }
// }
// class Main{
//     Node first = null;
//     Node last = null;

//     void insert(int d) {
//         Node newNode = new Node(d);

//         if (first == null) {
//             first = newNode;
//             last = newNode;
//             last.next = first;
//         } else {
//             last.next = newNode;
//             last = newNode;
//             last.next = first;
//         }
//     }
//     void playSongs(int k) {
//         if (first == null) {
//             System.out.println("Playlist is empty.");
//             return;
//         }

//         Node temp = first;

//         System.out.println("Songs Played:");
//         for (int i = 0; i < k; i++) {
//             System.out.println(temp.data);
//             temp = temp.next;
//         }
//     }
    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         Main obj = new Main();

//         System.out.println("Enter number of songs:");
//         int n = sc.nextInt();

//         System.out.println("Enter Song IDs:");
//         for (int i = 0; i < n; i++) {
//             obj.insert(sc.nextInt());
//         }

//         System.out.println("Enter number of songs to play:");
//         int k = sc.nextInt();

//         obj.playSongs(k);

//         sc.close();
//     }
// }

//
import java.util.Scanner;

public class doubly_circular {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
            next = null;
            prev = null;
        }
    }

    Node head = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node last = head.prev;

            last.next = newNode;
            newNode.prev = last;

            newNode.next = head;
            head.prev = newNode;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        doubly_circular list = new doubly_circular();

        System.out.println("Enter elements (-1 to stop):");

        int value;
        while ((value = sc.nextInt()) != -1) {
            list.insert(value);
        }

        System.out.println("Doubly Circular Linked List:");
        list.display();

        sc.close();
    }
}