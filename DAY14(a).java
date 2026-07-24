//Constructors

//Default Constructors
// import java.util.*;
// class Main{
//     int roll;
//     String name;
//     Main()
//     {
//         System.out.println(roll);
//         System.out.println(name);
//     }
//     public static void main(String args[]){
//         Main obj = new Main();
//     }
// }

//Parameterized Constructors
// import java.util.*;
// class Main{
//     int roll;
//     String name;
//     Main(int r, String n)
//     {
//         this.roll=r;
//         this.name=n;
//     }
//     void display()
//     {
//         System.out.println(roll+" "+name);
//     }
//     public static void main(String[] args){
//         Main s1=new Main(12,"ABC");
//         Main s2 = new Main(13,"XYZ");
//         s1.display();
//         s2.display();
//     }
// }

//// Superclass
class Vehicle {
    void displayVehicleType() {
        System.out.println("Vehicle Type: Vehicle");
    }
}

// Subclass Car
class Car extends Vehicle {
    void displayWheels() {
        System.out.println("Number of Wheels: Four Wheels");
    }
}

// Subclass Bike
class Bike extends Vehicle {
    void displayWheels() {
        System.out.println("Number of Wheels: Two Wheels");
    }
}

// Subclass Auto
class Auto extends Vehicle {
    void displayWheels() {
        System.out.println("Number of Wheels: Three Wheels");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Bike bike = new Bike();
        Auto auto = new Auto();

        System.out.println("Car Details:");
        car.displayVehicleType();
        car.displayWheels();

        System.out.println();

        System.out.println("Bike Details:");
        bike.displayVehicleType();
        bike.displayWheels();

        System.out.println();

        System.out.println("Auto Details:");
        auto.displayVehicleType();
        auto.displayWheels();
    }
}