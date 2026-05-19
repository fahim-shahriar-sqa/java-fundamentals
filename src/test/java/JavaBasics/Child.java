package JavaBasics;

/*
 * Child Class
 * The Child class inherits all properties and methods
 * from the Parent class using the 'extends' keyword.
 */

public class Child extends Parent {

    // Method inside Child class
    public void display() {

        System.out.println("----- Child Class -----");

        // Accessing inherited variables from Parent class
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Gender  : " + gender);
        System.out.println("Address : " + address);
    }

    // Main method of Child class
    public static void main(String[] args) {

        // Creating Child object
        Child child = new Child();

        // Calling Child method
        child.display();
    }
}