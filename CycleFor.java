package ru.academits.java.lesson1;

public class CycleFor {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            if (getMultipleFour(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean getMultipleFour(int number) {
        return number % 4 == 0;
    }
}