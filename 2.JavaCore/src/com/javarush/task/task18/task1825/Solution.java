package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/* 
Собираем файл
Собираем файл из кусочков.
Считывать с консоли имена файлов.
Каждый файл имеет имя: [someName].partN.

Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.

Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end".
В папке, где находятся все прочтенные файлы, создать файл без суффикса [.partN].

Например, Lion.avi.

В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки.


Требования:
1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "end".
2. Создай поток для записи в файл без суффикса [.partN] в папке, где находятся все считанные файлы.
3. В новый файл перепиши все байты из файлов-частей *.partN.
4. Чтение и запись должны происходить с использованием буфера.
5. Созданные для файлов потоки должны быть закрыты.
6. Не используй статические переменные.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String fileName;
        while (!(fileName = reader.readLine()).equals("end")) {
            list.add(fileName);
        }
        reader.close();
        Collections.sort(list);

        String[] stringArray = list.get(0).split(".part"); //первый элемент без .парт
        String summaryFileName = stringArray[0];

        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream = new FileOutputStream(summaryFileName, true);
        byte[] buffer;

        for (String aList : list) {
            fileInputStream = new FileInputStream(aList);
            buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            fileInputStream.close();
            fileOutputStream.write(buffer);
        }

        fileOutputStream.close();
    }
}

