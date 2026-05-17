package JavaBasics;

public class TypesOfVariables {

    int instanceVariable = 20; // Instance / non-static variable (outside method, inside class)

    static int staticVariable = 50; // Static / Class Variable

    public static void main(String[] args) {

        int localVariable = 5;  // Local Variable (inside method)

        TypesOfVariables obj = new TypesOfVariables(); // Creating Object

        System.out.println("Local Variable    : " + localVariable);
        System.out.println("Instance Variable : " + obj.instanceVariable);
        System.out.println("Static Variable   : " + staticVariable);
    }
}
