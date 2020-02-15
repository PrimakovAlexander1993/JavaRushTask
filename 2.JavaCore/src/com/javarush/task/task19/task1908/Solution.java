package com.javarush.task.task19.task1908;

/*
Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки.
Пример тела файла:
12 text var2 14 8ю 1

Результат:
12 14 1
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
                ArrayList<Integer> list = new ArrayList<>();
                while (fileReader.ready()) {
                    String line = fileReader.readLine();
                    String[] array = line.split(" ");
                    for (String s : array) {
                        try {
                            list.add(Integer.parseInt(s));
                        } catch (NumberFormatException e) {
                        }
                    }
                    for (Integer i : list) {
                        writer.write(i + " ");
                    }
                }
            }

        }
    }
}
