package com.javarush.task.task18.task1818;

/* 
Два в одном
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.


Требования:
1. Программа должна три раза считать имена файлов с консоли.
2. Для первого файла создай поток для записи. Для двух других - потоки для чтения.
3. Содержимое второго файла нужно переписать в первый файл.
4. Содержимое третьего файла нужно дописать в первый файл (в который уже записан второй файл).
5. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            String fileName3 = reader.readLine();

            //потоки для чтения
            try(FileInputStream fileInputStream2 = new FileInputStream(fileName2);
                FileInputStream fileInputStream3 = new FileInputStream(fileName3)){
                byte[] buffer2 = new byte[fileInputStream2.available()];
                fileInputStream2.read(buffer2);

                byte[] buffer3 = new byte[fileInputStream3.available()];
                fileInputStream3.read(buffer3);

                //поток для записи
                try(FileOutputStream fileOutputStream1 = new FileOutputStream(fileName1)){
                    fileOutputStream1.write(buffer2);
                    fileOutputStream1.close();

                    FileOutputStream fileOutputStream11 = new FileOutputStream(fileName1, true);
                    fileOutputStream11.write(buffer3);
                }
            }
        }
    }
}
