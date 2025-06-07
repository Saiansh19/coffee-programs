import java.util.*;

class Lab6SimpleMaths {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static double mul(double a, double b) {
        return a * b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(add(11, 11));
        System.out.println(add(12.5, 12.6));
        System.out.println(sub(22, 12));
        System.out.println(sub(24.3, 20.6));
        System.out.println(mul(12, 12));
        System.out.println(mul(14.4, 26.4));
        System.out.println(div(12, 12));
        System.out.println(div(12.48, 12.2));
    }
}
