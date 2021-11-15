package com.example.series;

public class Series {

    public static int nSum(int n) {
        int sum = 0;
        for (int i=0; i<=n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int factorial(int n) {
        int product = 1;
        for (int i=1; i<=n; i++) {
            product *= i;
        }
        return product;
    }

    public static int factorial1(int n) {
        return (n==0 || n==1) ? n : n * factorial(n-1);
    }

    public static int fibonacci(int n) {
            return (n==0 || n==1) ? n : fibonacci(n-1) + fibonacci(n-2);
    }
}
