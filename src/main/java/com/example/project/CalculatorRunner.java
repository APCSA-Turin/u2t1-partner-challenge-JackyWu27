package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator("Ti-84");
        System.out.println(calc1.performOperation("+", 5, 5));
        System.out.println(calc1.performOperation("-", 5, 5));
        System.out.println(calc1.performOperation("*", 5, 5));
        System.out.println(calc1.performOperation("/", 5, 5));
        System.out.println(calc1.divisibleBy(4, 2));
        System.out.println(calc1.divisibleBy(5, 3));
        System.out.println(calc1.coordinatePair(4, 3));
        System.out.println(calc1.info());
        System.out.println(calc1.absoluteValue(7, 3));
        System.out.println(calc1.absoluteValue(4, 9));
    }
}
