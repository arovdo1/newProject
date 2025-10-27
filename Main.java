// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, мир! Hello Vitaly!");

        System.out.println("5! (рекурсия) = " + factorialRecursive(5));
    }
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorialRecursive(n - 1);
    }
}