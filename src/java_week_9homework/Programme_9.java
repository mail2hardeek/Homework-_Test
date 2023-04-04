package java_week_9homework;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9 {
    public static void main(String[] args) { //Main method calling
        Programme_9 obj = new Programme_9();
        obj.method(); //Instance method calling


    }

    public void method() { //Instance method declared
        Map<String, Integer> people = new HashMap<>();
        people.put("Alice", 20);
        people.put("Ben", 30);
        people.put("Chris", 35);
        people.put("David", 41);
//Iterate over the values in the map using a for-each loop

        for (int ag : people.values()) {
            System.out.println("Age: " + "age");
        }
    }
}


