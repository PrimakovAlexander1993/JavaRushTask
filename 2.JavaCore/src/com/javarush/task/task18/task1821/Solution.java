package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете).

Вывести на консоль отсортированный результат:
[символ1] частота1
[символ2] частота2
Закрыть потоки.

Требования:
1. Считывать с консоли ничего не нужно.
2. Создай поток для чтения из файла, который приходит первым параметром в main.
3. В файле необходимо посчитать частоту встречания каждого символа и вывести результат.
4. Выведенный в консоль результат должен быть отсортирован по возрастанию кода ASCII.
5. Поток для чтения из файла должен быть закрыт.
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            throw new IllegalArgumentException();
        }

        File file1 = new File(args[0]);
        FileInputStream in = new FileInputStream(file1);
        TreeMap<Character, Integer> map = new TreeMap<>();
        byte[] data;
        char[] c = new char[0];

        while(in.available() > 0){
            data = new byte[in.available()];
            in.read(data);
            c = new String(data).toCharArray();//что было в byte засунули в char
        }

        for(char b : c){// с - массив байтов из файла
            if(map.containsKey(b)){ //проходим по значениям (значение,кол-во повторов)
                int val = map.get(b) + 1;
                map.put(b, val);
            } else {
                map.put(b, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        in.close();
    }
}