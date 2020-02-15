package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        String firstFileName = args[0];
        String secondFileName = args[1];



        try (FileInputStream inputStream = new FileInputStream(firstFileName);
             FileOutputStream outputStream = new FileOutputStream(secondFileName)) {

            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);

            Charset windows1251 = Charset.forName("Windows-1251");
            Charset utf8 = Charset.forName("UTF-8");

            String s = new String(buffer, windows1251);
            buffer = s.getBytes(utf8);
            outputStream.write(buffer);
        }

    }
}
