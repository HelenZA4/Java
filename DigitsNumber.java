package ru.academits.java.lesson1;

import java.util.Scanner;

public class DigitsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int sumAllDigits = getSumAllDigits(number);
        System.out.println("Сумма всех цифр числа: " + sumAllDigits);

        int sumOddDigits = getSumOddDigits(number);
        System.out.println("Сумма нечетных цифр числа: " + sumOddDigits);

        int maxDigit = getMaxDigit(number);
        System.out.println("Максимальная цифра числа: " + maxDigit);
    }

    public static int getSumAllDigits(int i) {
        int sum = 0;
        while (i != 0) {
            // Суммирование всех цифр числа
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }

    public static int getSumOddDigits(int j) {
        int sum = 0;
        while (j != 0) {
            // Суммирование нечетных цифр числа
            int digit = j % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            j /= 10;
        }
        return sum;
    }

    public static int getMaxDigit(int k) {
        int max = 0;
        while (k != 0) {
            // Нахождение максимальной цифры числа
            int digit = k % 10;
            max = Math.max( max, digit);
            k /= 10;
        }
        return max;
    }
}