import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack{
    private Node top;
    Stack(){
        top = null;
    }
void push(int data){
    Node n = new Node(data);
    top = n;
}
void pop(){
    if(top == null){
        System.out.println("Stack is empty : ");
    }else{
        n.next = top;
}
void peek(){
    if(top==null){
        System.out.println("Stack is empty");
    }else{
        System.out.println(top.data);
    }
}
void display(){
    if(top==null){
        System.out.println("Stack is empty: ");
        return;
    }
    else{
        while(top.next!=null){
            System.out.println(top.data+" ");
        }
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Stack s = new Stack();
        int choice = sc.nextInt();
        while(true){
            System.out.println("case 1: push");
            System.out.println("case 2: pop");
            System.out.println("case 3: peek");
            System.out.println("case 4: display");
        }
        switch(choice){
            case1:
            int data = sc.nextInt();
            s.push(data);
            return;
            
            case2:
            s.pop();
            return;
            
            case3:
            s.peek();
            return;
            
            case4:
            s.display();
            return;
        }
    }
}