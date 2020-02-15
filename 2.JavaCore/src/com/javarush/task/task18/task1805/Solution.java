package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Сортировка байт
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = reader.readLine();
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                TreeSet<Integer> treeSet = new TreeSet<>();

                while (fileInputStream.available() > 0) {
                    treeSet.add(fileInputStream.read());
                }

                for (Integer x : treeSet) {
                    System.out.println(x + " ");
                }
            }


        }

    }
}
