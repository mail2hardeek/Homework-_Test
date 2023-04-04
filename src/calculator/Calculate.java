package calculator;

/**
 * Create four methods with manes “addition”, “subtraction”, “division”,
 * and “multiplication”. All methods are instance methods and it doesn’t
 * return anything. But it has two parameters with the names “int a” and
 * “int b”. Also each method has System.out.println(). This prints the
 * result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the
 * logic in the calculateResult method that when the user enters first
 * number and second number and symbol based on symbol it does
 * calculate.
 */

public class Calculate { //Class declared

    public void addition(int a, int b) { //Declared instance method
        int x = a + b;
        System.out.println("Addition is : " + x);
    }

    public void subtraction(int a, int b) { //Declared instance method
        int x = a + b;
        int y = a - b;
        System.out.println("subtraction is : " + y);
    }

    public void division(int a, int b) { ////Declared instance method
        int x = a + b;
        int z = a / b;
        System.out.println("division is : " + z);
    }

    public void multiplication(int a, int b) { ////Declared instance method
        int x = a + b;
        int r = a * b;
        System.out.println("Multiplication is : " + r);
    }

    public void calculateResult(int a, int b, char c) { ////Declared instance method
        int x = a + b;
        if (c == '+') {
            addition(a, b);
        } else if (c == '_') {
            subtraction(a, b);
        } else if (c == '*') {
            multiplication(a, b);
        } else if (c == '/') {
            division(a, b);
        } else {
            System.out.println("Please enter correct symbol.");


        }

    }
}
