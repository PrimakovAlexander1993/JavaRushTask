package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Максимальный байт
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.


*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            ArrayList<Integer> list = new ArrayList<>();
            while (fileInputStream.available() > 0) {
                list.add(fileInputStream.read());
            }
            Collections.sort(list);
            System.out.println(list.get(list.size() - 1));
        }


        reader.close();

    }
}
