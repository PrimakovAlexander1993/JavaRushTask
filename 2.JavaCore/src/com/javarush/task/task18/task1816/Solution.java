package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.IOException;

/*
Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв).
Закрыть потоки.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        if (args.length > 0) {
            try(FileInputStream in = new FileInputStream(args[0])){
                while (in.available() > 0) {
                    int data = in.read();
                    if ((data >= Integer.valueOf('A') && data <= Integer.valueOf('Z'))
                            || (data >= Integer.valueOf('a') && data <= Integer.valueOf('z'))) {
                        count++;
                    }
                }
            }
        }

        System.out.println(Integer.valueOf(count));

    }
}
