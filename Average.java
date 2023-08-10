package ru.academits.java.lesson1;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное число диапазона: ");
        int start = scanner.nextInt();

        if (start <= 1) {
            System.out.println("Начальное число диапазона должно быть больше 1.");
            return;
        }

        System.out.println("Введите конечное число диапазона: ");
        int end = scanner.nextInt();

        if (end <= start) {
            System.out.println("Конечное число диапазона должно быть больше начального числа.");
            return;
        }

        double averageAll = getAverage(start, end);
        System.out.println("Среднее арифметическое всех чисел в диапазоне [" + start + ", " + end + "] равно: " + averageAll);

        double averageEven = getAverageEven(start, end);
        System.out.println("Среднее арифметическое четных чисел в диапазоне [" + start + ", " + end + "] равно: " + averageEven);
    }

    public static double getAverage(int start, int end) {
        int sum = 0;
        int count = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
            count++;
        }

        return (double) sum / count;
    }

    public static double getAverageEven(int start, int end) {
        int sumEven = 0;
        int countEven = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sumEven += i;
                countEven++;
            }
        }

        return (double) sumEven / countEven;
    }
}
