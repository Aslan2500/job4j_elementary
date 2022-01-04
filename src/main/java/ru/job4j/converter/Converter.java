package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        float rubles = 140;
        float euro = Converter.rubleToEuro(rubles);
        System.out.println(rubles + " rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(rubles);
        System.out.println(rubles + " rubles are " + dollar + " dollars.");
    }
}
