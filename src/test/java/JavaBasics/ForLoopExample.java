package JavaBasics;

public class ForLoopExample {
    public static void main(String[] args) {

        System.out.println("===== FOR LOOP EXAMPLE =====");

        // Basic for loop
        System.out.println("\n--- Basic For Loop ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        // Array
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("\n--- Traditional For Loop (Index Based) ---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " Value = " + numbers[i]);
        }

        System.out.println("\n--- Enhanced For Loop (For-Each) ---");
        for (int number : numbers) {
            System.out.println("Value = " + number);
        }
    }
}
