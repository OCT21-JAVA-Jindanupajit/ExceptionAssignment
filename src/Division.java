import java.util.Scanner;

class Division {
    public static void main(String[] args) {

        int a, b, result;

        Scanner input = new Scanner(System.in);
        System.out.println("Input two integers");

        a = input.nextInt();
        b = input.nextInt();

        try {
            result = a / b;
        } catch (java.lang.ArithmeticException ex) {
            System.out.println("Divide by Zero!");
            result = 0;
        }
        finally {
            System.out.println("finally block will execute.");
        }

        System.out.println("Result = " + result);
    }
}
