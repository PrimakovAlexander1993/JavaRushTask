package com.javarush.task.task19.task1904;

import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
Иванов Иван Иванович 31 12 1950
И еще один адаптер
Требования:
1. PersonScanner должен быть интерфейсом.
2. Класс PersonScannerAdapter должен реализовывать интерфейс PersonScanner.
3. Класс PersonScannerAdapter должен содержать приватное поле fileScanner типа Scanner.
4. Класс PersonScannerAdapter должен содержать конструктор с параметром Scanner.

5. Метод close() класса PersonScannerAdapter должен делегировать полномочие такому же методу fileScanner.
6. Метод read() класса PersonScannerAdapter должен читать строку с файла, парсить её, и возвращать данные только одного человека, в виде объекта класса Person.

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public void close() {
            fileScanner.close();
        }

        @Override
        public Person read() {
            String string =fileScanner.nextLine();
            String[] str= string.split(" ");
            Calendar calendar= new GregorianCalendar(Integer.parseInt(str[5]),Integer.parseInt(str[4])-1,Integer.parseInt(str[3]));
            Date date= calendar.getTime();
            Person person= new Person(str[0],str[1],str[2],date);
            return person;
        }
    }
}
