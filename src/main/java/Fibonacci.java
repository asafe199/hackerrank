package main.java;

public class Fibonacci {
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584
    public static Integer fibonacci(Integer n) {
        return n <= 1 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Integer max = 100;
        Integer i = 0;
        while (i < max){
            System.out.print(fibonacci(i) + ", ");
            i++;
        }
    }
}
