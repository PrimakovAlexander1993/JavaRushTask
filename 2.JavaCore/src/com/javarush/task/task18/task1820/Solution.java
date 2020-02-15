package com.javarush.task.task18.task1820;

/* 
Округление чисел
Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.

Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для первого файла создай поток для чтения. Для второго - поток для записи.
3. Считать числа из первого файла, округлить их и записать через пробел во второй.
4. Должны соблюдаться принципы округления, указанные в задании.
5. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader RD = new BufferedReader(new InputStreamReader(System.in));
        String one = RD.readLine();//f2 test
        String two = RD.readLine();//f1 test2

        try (FileInputStream f2 = new FileInputStream(one);
             PrintWriter pw = new PrintWriter(two)) {

            byte[] buff = new byte[f2.available()];//test

            while (f2.available() > 0) {//test
                f2.read(buff);
            }

            String s = new String(buff, "US-ASCII");
            String[] d = s.split(" ");

            for (int i = 0; i < d.length; i++) {
                float a = Float.parseFloat(d[i]);
                int y = Math.round(a);
                pw.print(y + " ");
            }

        }
    }
}


