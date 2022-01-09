package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{11}, {432, 532}, {72, 833, 79}, {123, 321, 225, 322}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Размер вложенного массива равен: " + numbers[i].length);
        }
    }
}
