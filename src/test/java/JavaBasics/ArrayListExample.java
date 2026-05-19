package JavaBasics;


import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        /*
         * ArrayList Syntax:
         * ArrayList<DataType> name = new ArrayList<DataType>();
         */

        // Creating an ArrayList of String type
        ArrayList<String> names = new ArrayList<String>();


        // ---------------- INITIAL STATE ----------------
        System.out.println("ArrayList : " + names);
        System.out.println("ArrayList Size : " + names.size());


        // ---------------- ADD ELEMENTS ----------------
        names.add("Fahim");
        names.add("Sazid");
        names.add("Akash");
        names.add("Jamal");
        names.add("Shishir");

        System.out.println("\nAfter Adding Elements:");
        System.out.println("ArrayList : " + names);
        System.out.println("ArrayList Size : " + names.size());


        // ---------------- CHECK EMPTY ----------------
        System.out.println("\nIs ArrayList Empty? " + names.isEmpty());


        // ---------------- ACCESS ELEMENT ----------------
        System.out.println("\nElement at Index 2 : " + names.get(2));


        // ---------------- REMOVE ELEMENT ----------------
        names.remove("Sazid");

        System.out.println("\nAfter Removing 'Sazid':");
        System.out.println("ArrayList : " + names);


        // ---------------- CLEAR ARRAYLIST ----------------
        // names.clear();
        // System.out.println("After Clear : " + names);


        // ---------------- LOOP THROUGH ARRAYLIST ----------------
        System.out.println("\nLooping Through ArrayList:");

        for (String name : names) {
            System.out.println("Name : " + name);
        }
    }
}