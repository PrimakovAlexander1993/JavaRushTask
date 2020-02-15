package com.javarush.task.task18.task1810;

/* 
DownloadException
DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки работы с файлами.
2.2 Выбросить исключение DownloadException.
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        while (true){
            BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
            String name=reader.readLine();
            FileInputStream fileInputStream= new FileInputStream(name);
            if (fileInputStream.available()<1000){
                fileInputStream.close();
                throw new DownloadException();
            }
        }


    }

    public static class DownloadException extends Exception {

    }
}
