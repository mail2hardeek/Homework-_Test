package java_week_9homework;
/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Programme_5 {

    public static void main(String[] args) { //Main Method declared
        Scanner abc = new Scanner(System.in); // Scanner called
        System.out.println("Enter the colour name: "); // Print Statement
        String name = abc.nextLine();
        System.out.println("Enter the second fruit name: ");
        String name1 = abc.nextLine();
        System.out.println("Enter the third fruit name: ");
        String name2 = abc.nextLine();
        Programme_5 obj = new Programme_5();
        obj.method(name, name1, name2); //Object calling
        abc.close(); // Scanner closed
    }

    public void method(String name, String name1, String name2) { //Static method
        //create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        //add some elements to the list
        list.add(name);
        list.add(name1);
        list.add(name2);
        //create an iterator for the list
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

        }
    }
}