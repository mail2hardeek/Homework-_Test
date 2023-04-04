package java_week_9homework;
/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Programme_6 {
    public static void main(String[] args) { //Declared main method
        Scanner abc = new Scanner(System.in); //Scanner declared
        System.out.println("Enter any digit from 1 to 6 : ");
        int index = abc.nextInt();
        Programme_6 obj = new Programme_6();
        obj.xyz(index);
        abc.close();  //Scanner closed
    }

    public void xyz(int index) { //Instance method called
        ArrayList<String> list = new ArrayList<String>();

        //Add elements to the array list
        list.add("_");
        list.add("Java");
        list.add("Selenium");
        list.add("RestAssured");
        list.add("Cucumber");
        list.add("Postman");
        list.add("SQL");

        //Retrieve the element at the specified index
        String element = list.get(index);

        //Print the element
        System.out.println("Element at index " + index + " + " + element);
    }
}
