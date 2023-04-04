import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme_4 {
    public static void main(String[] args) { //Declared main method
        //create a new Arraylist of colors
        ArrayList<String> colors = new ArrayList<String>();
        Scanner abc = new Scanner(System.in); //Scanner closed
        System.out.println("Enter the colour name: ");
        String name = abc.nextLine();
        System.out.println("Enter the second colour name: ");
        String name1 = abc.nextLine();
        System.out.println("Enter the third colour name: ");
        String name2 = abc.nextLine();
        Programme_4 obj = new Programme_4();
        obj.colours(name, name1, name2);
        abc.close(); //Scanner closed
    }

    public void colours(String name, String name1, String name2) { //Called instance method
        //create a new Arraylist of colors
        ArrayList<String> colors = new ArrayList<String>();

    }
}
