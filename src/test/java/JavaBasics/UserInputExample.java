package JavaBasics;

import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Integer Input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        input.nextLine();

        // String Input
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Boolean Input
        System.out.print("Enter true or false: ");
        boolean isStudent = input.nextBoolean();

        // Output
        System.out.println("\n===== User Information =====");
        System.out.println("Number     : " + number);
        System.out.println("Name       : " + name);
        System.out.println("Is Student : " + isStudent);

        input.close();
    }
}
