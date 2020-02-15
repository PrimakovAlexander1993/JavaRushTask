package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words.
Закрыть потоки.
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
                String input;
                String[] array;
                while ((input = fileReader.readLine()) != null) {
                    int counter = 0;
                    array = input.split(" "); // в аррей весь файл без пробелов
                    for (String s : array) {
                        if (words.contains(s)) {
                            counter++;
                        }
                    }
                    if (counter == 2) {
                        for (String s : array) {
                            System.out.println(s);
                        }
                        //System.out.println(Arrays.toString(array));
                    }

                }
            }
        }
    }
}
