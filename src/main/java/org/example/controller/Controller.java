package org.example.controller;

import org.example.service.AbstarctReadFile;
import org.example.service.LongestWordFinder;
import org.example.service.WordCounter;
import org.example.service.WordFrequencyAnalyzer;
import org.example.view.ViewUser;

import java.util.Scanner;

public class Controller {
    static Scanner scanner = new Scanner(System.in);
    static ViewUser viewUser = new ViewUser();

    static AbstarctReadFile abstarctReadFile;

    public static void main(String[] args) {
        boolean res = true;
        int welcom = viewUser.welcomeScreen(scanner);
        switch (welcom){
            case 1:
                abstarctReadFile = new LongestWordFinder();
                res = false;
                break;
            case 2:
                abstarctReadFile = new WordCounter();
                res = false;
                break;
            case 3:
                abstarctReadFile = new WordFrequencyAnalyzer();
                res = false;
                break;
            case 4:
                viewUser.endScreen();
                res = false;
                break;
            default:
                System.out.println("Введено некорректное значение \n" +
                        "Пожалуйста повторите попытку ");
                break;
        }

    }


}
