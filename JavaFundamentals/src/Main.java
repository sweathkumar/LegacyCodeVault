// This is a class. Everything in Java must be inside a class.
public class Main {
    // This is a method. It's where the execution of the program starts.
    public static void main(String[] args) {
        // Variables and data types
        int num = 10; // integer
        double decimal = 5.5; // floating point number
        char letter = 'A'; // character
        boolean flag = true; // boolean
        String name = "Sweath is no 1 Good Boy!"; //Anything

        // Operators
        int sum = num + 5; // addition
        int diff = num - 5; // subtraction
        int product = num * 2; // multiplication
        double quotient = num / 2.0; // division

        // Control structures
        if (quotient > 5) {
            System.out.println("Num is greater than 5");
        } else {
            System.out.println("Num is not greater than 5");
        }

        // For loop
        for (int i = 0; i < product; i++) {
            System.out.println("Loop iteration: " + i);
        }

        // Arrays
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number in array: " + number);
        }

        // Classes and objects
        MyClass myObject = new MyClass();
        myObject.myMethod();
    }
}

// Another class
class MyClass {
    void myMethod() {
        // Print Statement.
        System.out.println("Hello from myMethod of MyClass!");
    }
}
