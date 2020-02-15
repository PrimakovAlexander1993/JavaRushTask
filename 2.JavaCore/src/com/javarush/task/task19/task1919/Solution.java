package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени.
Закрыть потоки.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0]; //приходит имя файла
        ArrayList<String> fileList = new ArrayList<>(); //лист из параметров(имя)
        String input;
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));//считали в буффер файл
        while ((input = fileReader.readLine()) != null) {
            fileList.add(input);// добавляем в лист параметры
        }

        fileReader.close();
        ArrayList<String> names = new ArrayList<>(); //имя
        ArrayList<Double> values = new ArrayList<>(); //значение
        String[] stringArray;

        for (String aFileList : fileList) { //пробегаемся по листу с параметрами
            stringArray = aFileList.split(" ");
            names.add(stringArray[0]); //добавляем имена
            values.add(Double.parseDouble(stringArray[1])); //добавляем зарплаты
        }

        Map<String, Double> map = new TreeMap<>();
        for (int i = 0; i < names.size(); i++) {
            map.put(names.get(i), values.get(i)); // в три мап кладем имена / значения
        }

        ArrayList<String> ignoredNames = new ArrayList<>();
        //noinspection Duplicates
        for (int i = 0; i < names.size() - 1; i++) { //по листу со ВСЕМИ именами
            for (int j = i + 1; j < names.size(); j++) { //сравниваем 1 с 2 , 2 с 3, и т.д
                if (names.get(i).equals(names.get(j)) && !ignoredNames.contains(names.get(i))) {
                    double tmp = values.get(i) + values.get(j); //если имя 1 и 2 равно и его нет в листе,то плюсуем ЗП
                    map.put(names.get(i), tmp);
                    ignoredNames.add(names.get(i));
                }
            }
        }

        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
