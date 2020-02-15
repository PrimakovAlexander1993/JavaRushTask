package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        //Массив списков типа Стринг равно создать массив списков на 3 элемента
        ArrayList<String>[] listAll = new ArrayList[3];
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add("fsfs");
            list2.add("fsffgfdhh");
            list3.add("fsfsdfhdfhdd");
        }
        listAll[0] = list1;
        listAll[1] = list2;
        listAll[2] = list3;
        return listAll;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}