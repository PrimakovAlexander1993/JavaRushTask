package com.javarush.task.task19.task1909;

/* 
Замена знаков
Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла и заменить все точки "." на знак "!".
Результат вывести во второй файл.
Закрыть потоки.
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String fileName1 = reader.readLine();
            String fileName2 = reader.readLine();
            try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName1))){
                while (fileReader.ready()) {
                    String line = fileReader.readLine();
                    try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName2))){
                        bufferedWriter.write(line.replace(".", "!"));
                    }
                }
            }
        }

    }
}
