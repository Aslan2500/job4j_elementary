package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return Math.max(first, second);
    }

    public static int max(int first, int second, int third) {
        int maximum = max(first, second);
        return max(maximum, third);
    }

    public static int max(int first, int second, int third, int fourth) {
        int maximum1 = max(first, second);
        int maximum2 = max(third, fourth);
        return max(maximum1, maximum2);
    }

    public static void main(String[] args) {
        int result = Max.max(1, 2);
        System.out.println(result);
    }
}
