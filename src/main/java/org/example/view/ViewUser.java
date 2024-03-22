package org.example.view;

import java.util.Scanner;

public class ViewUser {
    public static int welcomeScreen(Scanner scanner) {
        System.out.println("Добро пожаловать в наше приложение");
        System.out.println("Для того чтобы продолжить выберете действие: " + '\n' +
                "1. Найти самое длинное слово в загруженном файле \n" +
                "2. Определить колличество слов в загруженном файле; \n" +
                "3. Определить частоту слов в загруженном файле; \n " +
                "4. Выйти из приложения");
        return scanner.nextInt();
    }
    public static void endScreen() {

        System.out.println("Спасибо что играли в нашу  игру. До новых встреч!");
    }

}
