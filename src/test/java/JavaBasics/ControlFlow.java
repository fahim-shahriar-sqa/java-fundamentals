package JavaBasics;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a == b) {
            System.out.println(a + " is equal to " + b);
        } else {
            System.out.println(a + " is less than " + b);
        }

        input.nextLine();

        // String Comparison Example
        System.out.print("\nEnter first text : ");
        String text1 = input.nextLine();

        System.out.print("Enter second text: ");
        String text2 = input.nextLine();

        if (text1.equals(text2)) {
            System.out.println("Exact match (case-sensitive)");
        } else if (text1.equalsIgnoreCase(text2)) {
            System.out.println("Match found (case-insensitive)");
        } else {
            System.out.println("Texts are different");
        }
    }
}
