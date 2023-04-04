package calculator;
/**
 * Write a “main” method into the main class. It has a scanner that takes
 * user input. Also write the logic that it ask user to “Enter first Number:”,
 * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 * enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 * other symbols.
 * 5. With the result it’s also print one more message “Would you like to do
 * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 * enter Y program asking the user to enter First Number, and if user enter
 * N programme should terminate)
 */

import java.util.Scanner;

public class Main { //Class file name
    public static void main(String[] args) { //Declared MAin method
        Scanner scanner = new Scanner(System.in); //Scanner
        char request = 'Y';
        while (request == 'Y') {
            System.out.print("Enter first number:  "); //Print Statement
            int a = scanner.nextInt();
            System.out.print("Enter second number:  "); //Print Statement
            int b = scanner.nextInt();
            System.out.print("Enter any symbol from +,-,*,/ : "); // Print statement
            char c = scanner.next().charAt(0);
            Calculate obj = new Calculate();
            obj.calculateResult(a, b, c);
            System.out.println("Would you like to do more calculation Enter Y or N : "); //Print Statement
            request = scanner.next().charAt(0);
        }
        scanner.close(); //Scanner closed
        System.out.println("Program terminated.");
    }

}


