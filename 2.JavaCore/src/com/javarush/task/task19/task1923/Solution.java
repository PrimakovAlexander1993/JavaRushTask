package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со словами, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d.
Закрыть потоки.
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader readFirstFile = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writeSecondFile = new BufferedWriter(new FileWriter(args[1]))) {
            String[] temp;
            while (readFirstFile.ready()) {
                temp = readFirstFile.readLine().split(" ");
                for (String s : temp) {
                    if (s.matches(".*\\d.*")) {
                        writeSecondFile.write(s + " ");
                    }
                }
            }
            writeSecondFile.flush();
        }

    }
}
