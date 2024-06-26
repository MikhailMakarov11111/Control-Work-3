package org.example.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWordFinder extends AbstarctReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);

            String longestWord = "";
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            System.out.println("Самое длинное слово в файле 'input.txt': " + longestWord);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден.");
        }
    }
}
