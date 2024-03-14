package org.example;

public class Fibonacci {

    public static void main(String[] args) {

        int value = 144;

        if (!fibonacciContains(value)) {
            System.out.println("\n" + value + " NAO pertence a sequencia!");
        } else {
            System.out.println("\n" + value + " pertence a sequência!");
        }

    }

    static boolean fibonacciContains(int value) {

        int a = 1, b = 0, aux;

        while (b <= value) {
            System.out.print(b + " ");
            if (b == value) {
                return true;
            }
            aux = a;
            a += b;
            b = aux;
        }

        return false;
    }
}