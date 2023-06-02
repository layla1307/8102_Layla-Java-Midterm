package math_problems;

public class Factorial {

    /** INSTRUCTIONS
     *
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    static int factorialRecursion(int x) {
        if (x == 0)
            return 1;
        return x * factorialRecursion(x - 1);
    }
        static int factorialIteration(int xx) {
            int a = 1;
            int i;
            for (i = 2; i <= xx;i++)
                a *= i;
            return a;
        }
    public static void main(String[] args) {
        int number1 = 7;
        System.out.println("Factorial of " + number1 + " is "+ factorialRecursion(7));

        int number2 = 9;
        System.out.println("Factorial of " + number2 + " is "+ factorialIteration(9));


    }

}
