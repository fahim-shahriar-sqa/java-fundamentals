package JavaBasics;

public class ExceptionHandling {
    // Exception handling
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            System.out.println("Result : " + (a / b));

        } catch (Exception e) {
            // Handling the exception
            System.out.println("Exception Caught!");
            System.out.println(e);
        }

        System.out.println("Program Finished Successfully.");
    }
}
