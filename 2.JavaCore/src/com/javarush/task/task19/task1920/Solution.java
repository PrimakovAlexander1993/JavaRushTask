package com.javarush.task.task19.task1920;

/* 
Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Вывести в консоль имена в алфавитном порядке, у которых максимальная сумма.
Имена разделять пробелом либо выводить с новой строки.
Закрыть потоки.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename = args[0];
        //String filename = "/Users/alex/Downloads/JavaRushTasks/2.JavaCore/src/com/javarush/task/task19/task1920/A";
        BufferedReader fileReader = new BufferedReader(new FileReader(filename));
        ArrayList<String> list = new ArrayList<>();
        String input;
        while ((input = fileReader.readLine()) != null) { //пока входная строка не ровна нулю
            list.add(input); //добавили в лист все из ФАЙЛА
        }
        fileReader.close();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> values = new ArrayList<>();
        String[] array; //массив для строк без пробелов

        for (String aFileList : list) { //пробегаемся по листу с параметрами
            array = aFileList.split(" ");
            names.add(array[0]); //добавляем имена
            values.add(Double.parseDouble(array[1])); //добавляем зарплаты
        }
        Map<String, Double> map = new TreeMap<>();
        for (int i = 0; i < names.size(); i++) {
            map.put(names.get(i), values.get(i));
        }
        ArrayList<String> ignoreNames = new ArrayList<>();
        for (int i = 0; i < names.size() - 1; i++) { //по листу со ВСЕМИ именами
            for (int j = i + 1; j < names.size(); j++) { //сравниваем 1 с 2 , 2 с 3, и т.д
                if (names.get(i).equals(names.get(j)) && !ignoreNames.contains(names.get(i))) {
                    double tmp = values.get(i) + values.get(j); //если имя 1 и 2 равно и его нет в листе,то плюсуем ЗП
                    map.put(names.get(i), tmp);
                    ignoreNames.add(names.get(i));
                }
            }
        }

        ArrayList<Double> listMax = new ArrayList<>(); 
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            listMax.add(pair.getValue());
        }
        Collections.sort(listMax); //отсортировали максимальные значения по возрастанию

        double max;
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> pair : map.entrySet()) {
            max = listMax.get(listMax.size() - 1); //максимальному присвоили конечное значение листа ЛистМах

            if (pair.getValue() == max) { //если значение равно максимальному
                resultMap.put(pair.getKey(), pair.getValue());
            }
        }
        for (Map.Entry<String, Double> pair : resultMap.entrySet()) {
            System.out.println(pair.getKey());
        }


    }
}
