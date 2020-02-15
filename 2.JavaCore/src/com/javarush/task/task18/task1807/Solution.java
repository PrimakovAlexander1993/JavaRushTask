package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
С консоли считать имя файла.
Посчитать в файле количество символов ',', количество вывести на консоль.
Закрыть потоки.

Подсказка:
нужно сравнивать с ascii-кодом символа ','.


*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        byte[] buffer = new byte[fileInputStream.available()];

        while (fileInputStream.available() > 0) {
            int count = fileInputStream.read(buffer);
        }
        int counter = 0;
        int value = 44;
        for (int i = 0; i < buffer.length - 1; i++) {
            if (buffer[i] == value){
                counter++;
            }
        }
        System.out.println(counter);
        fileInputStream.close();
        reader.close();
    }
}
