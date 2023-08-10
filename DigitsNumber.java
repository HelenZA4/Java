package ru.academits.java.lesson1;

import java.util.Scanner;

public class DigitsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = Math.abs(scanner.nextInt()); // Приводим число к значению по модулю

        int sumAllDigits = getSumAllDigits(number);
        System.out.println("Сумма всех цифр числа: " + sumAllDigits);

        int sumOddDigits = getSumOddDigits(number);
        System.out.println("Сумма нечетных цифр числа: " + sumOddDigits);

        int maxDigit = getMaxDigit(number);
        System.out.println("Максимальная цифра числа: " + maxDigit);
    }

    public static int getSumAllDigits(int number) {
        int sum = 0;
        while (number != 0) {
            // Суммирование всех цифр числа
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int getSumOddDigits(int number) {
        int sum = 0;
        while (number != 0) {
            // Суммирование нечетных цифр числа
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static int getMaxDigit(int number) {
        int max = 0;
        while (number != 0) {
            // Нахождение максимальной цифры числа
            int digit = number % 10;
            max = Math.max(max, digit);
            number /= 10;
        }
        return max;
    }
}
