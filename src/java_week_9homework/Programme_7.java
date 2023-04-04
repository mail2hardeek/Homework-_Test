package java_week_9homework;
/**
 * Write a Java program to test if an array list is empty or not.
 */

import java.util.ArrayList;

public class Programme_7 {

    public static void main(String[] args) {// Declared main method
        Programme_7 obj = new Programme_7();
        obj.method(); //method calling
    }

    public void method() { //Instance method
        ArrayList<String> list = new ArrayList<String>();
        //add some elements to the list
        list.add("Honda");
        list.add("Merc");
        list.add("BMW");
        list.add("Toyota");
        list.add("Suzuki");
        list.add("Audi");
        //check if the list is empty
        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty. ");
        } else {
            System.out.println("The ArrayList is not empty. ");
        }
    }

}
