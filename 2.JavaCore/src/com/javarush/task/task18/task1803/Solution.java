package com.javarush.task.task18.task1803;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
Ввести с консоли имя файла.
Найти байт или байты с максимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine(); //имя файла

        FileInputStream file = new FileInputStream(fileName); //Создаем поток-чтения-байт-из-файла
        ArrayList<Integer> bytes = new ArrayList<>();

        while (file.available() > 0) {
            bytes.add(file.read()); //считать из файла в лист
        }

        file.close();

        HashMap<Integer, Integer> map = new HashMap<>();

        initMapBytesCount(bytes, map);

        print(map, getMaxCount(map));
    }

    public static void print(HashMap<Integer, Integer> map, int maxCount) {

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() == maxCount)
                System.out.print(pair.getKey() + " ");
        }
    }

    public static int getMaxCount(HashMap<Integer, Integer> map) {
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue() > maxCount)
                maxCount = pair.getValue();
        }
        return maxCount;
    }

    public static void initMapBytesCount(ArrayList<Integer> bytes, HashMap<Integer, Integer> map) {

        for (int i = 0; i < bytes.size() - 1; i++) { // от нуля до конца файла
            int countSameBytes = 0;

            for (int n = i + 1; n < bytes.size(); n++) { //сравниваем со первый со вторым, второй с третим, третий с четверным
                if (bytes.get(n) == bytes.get(i)){
                    countSameBytes++; //если первый==второму то countSameBytes инкрементируем
                }
            }

            boolean contains = false;

            for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                if (pair.getKey() == bytes.get(i)) { //если ключ равен аррей листу ,то содержит
                    contains = true;
                }
            }

            if (!contains) {
                map.put(bytes.get(i), countSameBytes);
            }
        }
    }
}
