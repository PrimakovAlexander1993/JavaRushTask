package com.javarush.task.task19.task1921;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String.
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами.

Иванов Иван Иванович 31 12 1987
Вася 15 5 2013

Заполнить список PEOPLE используя данные из файла.
Закрыть потоки.
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        try (//FileReader fr = new FileReader(args[0]);
             FileReader fr = new FileReader("/Users/alex/Downloads/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1921/A");
             BufferedReader br = new BufferedReader(fr)) {
            while (br.ready()) {
                String[] buff = br.readLine().split(" "); //в buff все без пробелов

                String date = "", name = "";

                for (int i = buff.length - 3; i < buff.length; i++) {
                    date += buff[i] + " ";
                }


                for (int i = 0; i < buff.length - 3; i++) {
                    name += buff[i] + " ";
                }

                date = date.replaceAll(" $", "");
                name = name.replaceAll(" $", "");

            System.out.println("date = " + date);

                DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
                Date correctDate = null;
                try {
                    correctDate = dateFormat.parse(date);
                } catch (ParseException e) {
                }
            System.out.println("name = " + name + " - " + correctDate);

                PEOPLE.add(new Person(name, correctDate));
            }
        }
    }
}
