public class FactorialRecur {

    static int factorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        int number = 5;

        System.out.println("Factorial of " + number + " is " + factorial(number));
    }
}
