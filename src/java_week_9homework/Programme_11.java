package java_week_9homework;

import java.util.ArrayList;

/**
 * Declare following two arrylist and compare it.
 * <p>
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */

public class Programme_11 {
    public static void main(String[] args) { //Declared main method
        Programme_11 obj = new Programme_11();
        obj.method(); //Instance method calling
    }

    public void method() { //Instance method declared
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        if (c1.equals(c2)) {
            System.out.println("c1 and c2 are equal");
        } else {
            System.out.println("c1 and c2 are not equal");
        }
    }


}
