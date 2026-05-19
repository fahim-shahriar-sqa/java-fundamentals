package JavaBasics;

public class MethodExamples {
    // Instance Variable (Non-static)
    // Belongs to object
    // Each object gets its own copy

    int a = 10;

    // Static Variable
    // Belongs to class
    // Shared among all objects

    static int b = 20;

    // Non-static Method
    // Needs object to call

    public void sum(int a, int b) {

        int result = a + b;

        System.out.println("Sum is : " + result);
    }

    // Static Method
    // Can be called directly using class name
    // No object required

    public static void sub(int a, int b) {

        int result = a - b;

        System.out.println("Sub is : " + result);
    }

    // Non-static method accessing:
    // instance variable
    // static variable

    public void mul() {

        int result = a * b;

        System.out.println("Mul is : " + result);
    }

    public static void main(String[] args) {

        // 1. Calling static method directly
        sub(19, 11);

        // 2. Creating object to access
        //    non-static variables & methods
        MethodExamples obj = new MethodExamples();



        // Calling non-static methods using object
        obj.sum(10, 20);

        obj.mul();

        // 3. Accessing variables properly
        // Non-static variable -> object needed
        // Static variable -> class name preferred
        int c = obj.a * MethodExamples.b;

        System.out.println("a * b = " + c);
    }
}
