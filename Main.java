package ru.academits.java.lesson1.OOP;

import java.util.Scanner;

import static ru.academits.java.lesson1.OOP.Person.getYearBirth;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите отчество: ");
        String middleName = scanner.nextLine();

        System.out.print("Введите фамилию: ");
        String familyName = scanner.nextLine();

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        int yearBirth = getYearBirth(age);
        System.out.println("Год рождения: " + yearBirth);
    }
}