package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
Сериализуй класс Solution.
Подумай, какие поля не нужно сериализовать, пометь ненужные поля модификатором transient.
Объект всегда должен содержать актуальные итоговые данные.
Метод main не участвует в тестировании.

Написать код проверки самостоятельно в методе main:
1) создать файл, открыть поток на чтение (input stream) и на запись(output stream);
2) создать экземпляр класса Solution - savedObject;
3) записать в поток на запись savedObject (убедитесь, что они там действительно есть);
4) создать другой экземпляр класса Solution с другим параметром;
5) загрузить из потока на чтение объект - loadedObject;
6) проверить, что savedObject.string равна loadedObject.string;
7) обработать исключения.

*/
public class Solution implements Serializable {
    public static void main(String[] args) {
        System.out.println(new Solution(4));
        ObjectOutputStream oss = null; //создаем на запись
        try {
            oss = new ObjectOutputStream(new FileOutputStream("/Users/alex/Downloads/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2014/A"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Solution savedObject = new Solution(18);
        try {
            assert oss != null;
            oss.writeObject(savedObject); //пишем
            oss.flush();
            oss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ObjectInputStream ois = null; //создаем на чтение
        try {
            ois = new ObjectInputStream(new FileInputStream("/Users/alex/Downloads/JavaRushTasks/2.JavaCore/src/com/javarush/task/task20/task2014/A"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Solution loadedObject = null;
        try {
            loadedObject = (Solution) ois.readObject(); //читаем

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(savedObject.toString());
        System.out.println(loadedObject.toString());
        System.out.println(savedObject.string.equals(loadedObject.string));
    }

    private final transient String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
