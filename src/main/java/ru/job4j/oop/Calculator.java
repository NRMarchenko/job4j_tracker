package ru.job4j.oop;

public class Calculator {

    private static int x = 10;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int divide(int y) {
        return x / y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int sumAllOperation(int y) {
        return (sum(y) + minus(y) + divide(y) + multiply(y));
    }

    public static void main(String[] args) {
        int sum = Calculator.sum(10);
        System.out.println(sum);

        Calculator calculator = new Calculator();
        int multiply = calculator.multiply(10);
        System.out.println(multiply);

        int minus = Calculator.minus(10);
        System.out.println(minus);

        int divide = calculator.divide(10);
        System.out.println(divide);

        int sumAll = calculator.sumAllOperation(10);
        System.out.println(sumAll);
    }
}