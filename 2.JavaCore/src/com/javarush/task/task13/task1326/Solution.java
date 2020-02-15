package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException, NullPointerException {
        // напишите тут ваш код
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             InputStream inStream = new FileInputStream(reader.readLine())) {
            ArrayList list = new ArrayList();           //список цифр, которые мы потом будем сортировать, сортировать будем через list.remove, если нечет
            StringBuilder stringBuilder = new StringBuilder();          //для пришивания
            while (inStream.available() > 0){         //вызываем по одному байту из файла
                stringBuilder.append((char) inStream.read());//читаем один байт
            }
            String a = (stringBuilder.toString());
            StringTokenizer st = new StringTokenizer(a, " \t\n\r,.");
            while (st.hasMoreTokens()) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            int[] array = new int[list.size()];
            int i = 0;
            for (Object text : list) {
                array[i] = (int) text;
                i++;
            }
            Arrays.sort(array);
            for (i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    System.out.println(array[i]);
                }
            }
        }
    }

}
