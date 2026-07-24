//Single inheritance
// import java.util.*;
// class Father{
//     void gen2(){
//         System.out.println("Gold");
//     }
// }
// class son extends Father{
//     void gen3(){
//         System.out.println("Cash");
//     }
// }
// class Main{
//     public static void main(String[] args){
//         son obj = new son();
//         obj.gen3();
//         obj.gen2();
//         Father f = new Father();
//         obj.gen2();
//     }
// }

//MultiLevel inheritance
// import java.util.*;
// class Grandfather{
//     void gen1(){
//         System.out.println("Diamond");
//     }
// }
// class Father extends Grandfather{
//     void gen2(){
//         System.out.println("Gold");
//     }
// }
// class son extends Father{
//     void gen3(){
//         System.out.println("Cash");
//     }
// }
// class Main{
//     public static void main(String args[]){
//         son obj = new son();
//         obj.gen3();
//         obj.gen2();
//         obj.gen1();
//         Father f = new Father();
//         f.gen2();
//         f.gen1();
//         Grandfather g = new Grandfather();
//         g.gen1();
//     }
// }

//Hierarchical inheritance
// import java.util.*;
// class Father{
//     void gen2(){
//         System.out.println("Gold");
//     }
// }
// class Son extends Father{
//     void gen31(){
//         System.out.println("Cash");
//     }
// }
// class Daughter extends Father{
//     void gen32(){
//         System.out.println("Platinum");
//     }
// }
// class Main{
//     public static void main(String[] args){
//         Son s = new Son();
//         s.gen31();
//         s.gen2();
//         Daughter d = new Daughter();
//         d.gen32();
//         d.gen2();
//         Father f = new Father();
//         f.gen2();
        
//     }
// }

//Hybrid inheritance
// import java.util.*;
// class Grandfather{
//     void gen1(){
//         System.out.println("Diamond");
//     }
// }
// class Father extends Grandfather{
//     void gen2(){
//         System.out.println("Gold");
//     }
// }
// class Mother extends Father{
//     void gen21(){
//         System.out.println("Copper");
//     }
// }
// class Son extends Father{
//     void gen3(){
//         System.out.println("Cash");
//     }
// }
// class Main{
//     public static void main(String[] args){
//         Son s = new Son();
//         s.gen3();
//         s.gen2();
//         Father f = new Father();
//         f.gen2();
//         f.gen1();
//         Grandfather g = new Grandfather();
//         g.gen1();
//         Mother m = new Mother();
//         m.gen21();
//         m.gen2();
        
        
//     }
// }