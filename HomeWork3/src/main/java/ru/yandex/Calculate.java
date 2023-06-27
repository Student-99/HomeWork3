package ru.yandex;

public class Calculate {
    public static Long calculate(Long number){

        do{
            int sum = 0;
            do {
                sum +=number%10;
                number = number/10;
            }while ((number%10>0)|(number/10>0));
            number = (long) sum;
        }while (number/10>0);
        return number;
    }
}
