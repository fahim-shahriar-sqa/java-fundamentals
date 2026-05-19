package JavaBasics;

public class StaticExample {

    /*
     * Static blocks execute before the main() method.
     * They are mainly used for initializing static data.
     * Multiple static blocks run in the order they appear.
     */

    // First static block
    static {
        System.out.println("Static Block 1");
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Main Program Running...");
    }

    // Second static block
    static {
        System.out.println("Static Block 2");
    }
}