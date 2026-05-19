package JavaBasics;

/*
 * Parent Class
 * This class contains common properties and methods
 * that can be inherited by other classes.
 */

public class Parent {

    // Parent class variables
    String name = "Test";
    int age = 20;
    String gender = "Male";
    String address = "Dhaka";



    // Method to display parent information
    public void displayInformation() {

        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Gender  : " + gender);
        System.out.println("Address : " + address);
    }



    // Main method of Parent class
    public static void main(String[] args) {

        Parent parent = new Parent();

        System.out.println("----- Parent Class -----");

        parent.displayInformation();
    }
}