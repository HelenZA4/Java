package ru.academits.java.lesson1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное число диапазона: ");
        int a = scanner.nextInt();

        if (a <= 1) {
            System.out.println("Начальное число диапазона должно быть больше 1.");
            return;
        }

        System.out.println("Введите конечное число диапазона: ");
        int x = scanner.nextInt();

        if (x <= a) {
            System.out.println("Конечное число диапазона должно быть больше начального числа.");
            return;
        }

        double averageAll = getAverage(a, x);
        System.out.println("Среднее арифметическое всех чисел в диапазоне [" + a + ", " + x + "] равно: " + averageAll);

        double averageEven = getAverageEven(a, x);
        System.out.println("Среднее арифметическое четных чисел в диапазоне [" + a + ", " + x + "] равно: " + averageEven);
    }

    public static double getAverage(int a, int x) {
        int sum = 0;
        int count = 0;

        for (int i = a; i <= x; i++) {
            sum += i;
            count++;
        }

        return (double) sum / count;
    }

    public static double getAverageEven(int a, int x) {
        int sumEven = 0;
        int countEven = 0;

        for (int i = a; i <= x; i++) {
            if (i % 2 == 0) {
                sumEven += i;
                countEven++;
            }
        }

        return (double) sumEven / countEven;
    }
}