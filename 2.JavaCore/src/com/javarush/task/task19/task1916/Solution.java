package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader1 = new FileReader(reader.readLine());
        FileReader fileReader2 = new FileReader(reader.readLine());
        reader.close();
        try (BufferedReader reader1 = new BufferedReader(fileReader1);
             BufferedReader reader2 = new BufferedReader(fileReader2)) {
            ArrayList<String> list1 = listFill(reader1);
            ArrayList<String> list2 = listFill(reader2);
            int j = 0;
            for (int i = 0; i < list1.size(); i++) {
                if (Objects.equals(list1.get(i), list2.get(j))) {
                    lines.add(new LineItem(Type.SAME, list1.get(i)));
                    if ((j + 1) < list2.size()) j++;
                    else if (i < list1.size() - 1) {
                        lines.add(new LineItem(Type.REMOVED, list1.get(i + 1)));
                        break;
                    } else break;
                } else if (Objects.equals(list1.get(i), list2.get(j + 1))) {
                    lines.add(new LineItem(Type.ADDED, list2.get(j)));
                    lines.add(new LineItem(Type.SAME, list1.get(i)));
                    if ((j + 2) < list2.size()) j += 2;
                    else {
                        lines.add(new LineItem(Type.REMOVED, list1.get(i + 1)));
                        break;
                    }
                } else lines.add(new LineItem(Type.REMOVED, list1.get(i)));
            }
            if (j < list2.size()) lines.add(new LineItem(Type.ADDED, list2.get(j)));
            for (LineItem line : lines) {
                System.out.printf("%s %s%n", line.type, line.line);
            }
        }


    }

    private static ArrayList<String> listFill(BufferedReader reader) throws IOException {
        String line;
        ArrayList<String> list = new ArrayList<>();
        while ((line = reader.readLine()) != null) list.add(line);
        return list;
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}