package org.example.view;

import java.util.Scanner;

public class viewUser {
    public static int welcomeScreen(Scanner scanner) {
        System.out.println("Добро пожаловать в наше приложение);
        System.out.println("Для того чтобы продолжить выберете действие: " + '\n' +
                "1. Правила игры \n" +
                "2. Начать игру с числами; \n" +
                "3. Начать игру с русскими буквами; \n" +
                "4. Начать игру с английскими буквами; \n" +
                "5. Закончить игру");
        return scanner.nextInt();
    }
}
