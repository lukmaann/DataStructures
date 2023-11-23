package javaBasics;

import java.util.*;

public class functions {

    public static void printHelloWorld(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println("hello world");
        }
        ;
    }

    public static int factorial(int n) {

        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binomialCoefficent(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));

    }

    public static boolean isPrime(int n) {

        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInARange(int n) {

        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + ",");
            }
        }
    }

    public static double binToDec(int n) {
        double dec = 0;
        int number = n;

        double power = 0;

        while (number > 0) {
            int ld = number % 10;

            dec = dec + (ld * Math.pow(2, power));

            number /= 10;
            power++;

        }

        return dec;
    }

    public static int decToBin(int n) {
        int pow = 0;
        int bin = 0;

        while (n > 0) {
            int rem = n % 2;

            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            n /= 2;

        }
        return bin;
    }

    public static void AverageOf3(int a, int b, int c) {
        System.out.println((a + b + c) / 3);
    }

    public static void printPalindromePyramid(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }

            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }

            System.out.println();
        }

    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static boolean isPalindrome(int n) {
        int rev = 0;
        int number = n;

        while (n > 0) {
            int ld = n % 10;
            rev = rev * 10 + ld;

            n = n / 10;
        }

        return (rev == number);
    }

    public static void sumDigit(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println(sum);
    }

    public static void febonachi(int n) {

        int a = 0;
        int b = 1;

        for (int i = 0; i <= n; i++) {
            int c = a + b;
            System.out.print(b + " ");
            a = b;
            b = c;

            ;

        }
    }

    public static void main(String args[]) {

        printPalindromePyramid(5);

    }
}