package JavaBasics;

public class WhileLoopExample {
    public static void main(String[] args) {

        // While loop example
        System.out.println("\n--- While Loop ---");
        int count = 0;

        while (count < 10) {
            System.out.println("Count = " + count);
            count++;
        }

        // Do-While loop example
        System.out.println("\n--- Do-While Loop ---");
        int num = 1;

        do {
            System.out.println("Number = " + num);
            num++;
        } while (num < 2);
    }
}
