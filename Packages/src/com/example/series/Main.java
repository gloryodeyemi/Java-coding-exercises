package com.example.series;

public class Main {
    public static void main(String[] args) {
        Series series = new Series();

        System.out.println("==================\nSum\n" +
                "==================");

        for (int i=0; i<=10; i++){
            System.out.println(Series.nSum(i));
        }

        System.out.println("==================\nFactorial\n" +
                "==================");

        for (int i=1; i<=10; i++){
            System.out.println(Series.factorial(i));
        }

        System.out.println("==================\nFibonacci\n" +
                "==================");

        for (int i=0; i<=10; i++){
            System.out.println(Series.fibonacci(i));
        }
    }
}
