// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, мир! Hello Vitaly!");

        System.out.println("5! (рекурсия) = " + factorialRecursive(5));
        System.out.println("5! (итерация) = " + factorialIterative(5));
    }
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}