package java_week_9homework;
/**
 * Write a Java program to reverse an array of integer values.
 */

import java.util.Arrays;

public class Programme_3 {
    public static void main(String[] args) { //Declared main method
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) { //Declared static method
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
