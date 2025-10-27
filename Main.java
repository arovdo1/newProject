// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, мир! Hello Vitaly!");
    }
    public static long factorialRecursive(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorialRecursive(n - 1);
    }
}