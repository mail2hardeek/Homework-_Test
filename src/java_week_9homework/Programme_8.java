package java_week_9homework;

import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class Programme_8 {
    public static void main(String[] args) { //Main method calling
        Programme_8 obj = new Programme_8();
        obj.method2(); //Instance method calling
    }

    public void method2() { //Instance method calling
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(5);
        set.add(7);

        for (int i = 1; i <= 10; i++) {
            if (set.contains(i)) {
                System.out.println(i + "is in the set");
            } else {
                System.out.println((i + "is not in the set"));
            }
        }
    }
}
