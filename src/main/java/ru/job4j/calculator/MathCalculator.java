package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double substractAndDevide(double first, double second) {
        return substract(first, second) + devide(first, second);
    }

    public static double sumTotal(double first, double second) {
        return substract(first, second) + devide(first, second) + sum(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета1 равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета2 равен: " + substractAndDevide(10, 20));
        System.out.println("Результат расчета3 равен: " + sumTotal(10, 20));
    }
}
