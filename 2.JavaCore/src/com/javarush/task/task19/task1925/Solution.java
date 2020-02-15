package com.javarush.task.task19.task1925;

/* 
Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6.
В конце файла2 запятой не должно быть.
Закрыть потоки.
*/


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(args[0]);
        FileWriter fw = new FileWriter(args[1]);
//        FileReader fr = new FileReader("3.txt");
//        FileWriter fw = new FileWriter("4.txt");
        List<String> list = new ArrayList<>();

        String text = "";
        while (fr.ready()) {
            String temp = String.valueOf((char) fr.read());

            if (temp.equals(" ") || temp.equals("\n")) {
                list.add(text);
                text = "";
                temp = "";
            }
            text += temp;
        }
        list.add(text);
        fr.close();

        text = "";
        for (String temp : list) {
            if (temp.length() > 6) {
                text += temp + ",";
            }
        }

        text = text.replaceAll(",$", "");
        fw.write(text);
        fw.close();
    }
}
