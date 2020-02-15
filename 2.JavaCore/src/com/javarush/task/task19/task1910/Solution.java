package com.javarush.task.task19.task1910;

/* 
Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой строки.

Результат вывести во второй файл.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1))) {
                while (fileReader.ready()) {
                    String line = fileReader.readLine();
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
                        writer.write(line.replaceAll("[\\p{P}\\n]", ""));
                    }

                }
            }

        }


    }
}
