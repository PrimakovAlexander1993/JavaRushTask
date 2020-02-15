package com.javarush.task.task18.task1819;

/* 
Объединение файлов
Объединение файлов
Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.

1. Программа должна два раза считать имена файлов с консоли.
2. Не используй в программе статические переменные.
3. Для первого файла создай поток для чтения и считай его содержимое.
4. Затем, для первого файла создай поток для записи(поток для записи должен быть один). Для второго - для чтения.
5. Содержимое первого и второго файла нужно объединить в первом файле.
6. Сначала должно идти содержимое второго файла, затем содержимое первого.
7. Созданные для файлов потоки должны быть закрыты.


*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        //3. Для первого файла создай поток для чтения и считай его содержимое.
        try(FileInputStream fileInputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream = new FileOutputStream(file1);//4.Для первого файла создай поток для записи
            FileInputStream fileInputStream1 = new FileInputStream(file2)){//Для второго - для чтения.

            byte[] buff = new byte[fileInputStream.available()];//5. Содержимое первого и второго файла нужно объединить в первом файле.
            while (fileInputStream.available() > 0) {
                fileInputStream.read(buff, 0, buff.length);
            }

            //6. Сначала должно идти содержимое второго файла, затем содержимое первого.
            byte[] buff2 = new byte[fileInputStream1.available()];
            while (fileInputStream1.available() > 0) {
                fileInputStream1.read(buff2);
            }
            fileOutputStream.write(buff2, 0, buff2.length);
            fileOutputStream.write(buff);
        }



    }
}
