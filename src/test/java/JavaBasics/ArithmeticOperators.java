package JavaBasics;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number  : ");
        int a = input.nextInt();

        System.out.print("Enter second number : ");
        int b = input.nextInt();

        int sum = a + b;
        int difference = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulus = a % b;

        System.out.println("Addition       : " + sum);
        System.out.println("Subtraction    : " + difference);
        System.out.println("Multiplication : " + multiplication);
        System.out.println("Division       : " + division);
        System.out.println("Modulus        : " + modulus);
    }
}
