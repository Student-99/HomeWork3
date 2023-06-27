package ru.yandex;

public class Calculate {
    public static Long calculate(Long number) {

        while (number > 9) {
            int sum = 0;
            do {
                sum += number % 10;
                number = number / 10;
            } while (number > 0);
            number = (long) sum;
        }
        return number;
    }
}
