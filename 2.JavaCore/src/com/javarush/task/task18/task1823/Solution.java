package com.javarush.task.task18.task1823;



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit".
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки.


Требования:
1. Программа должна считывать имена файлов с консоли, пока не будет введено слово "exit".
2. Для каждого файла создай нить ReadThread и запусти ее.
3. После запуска каждая нить ReadThread должна создать свой поток для чтения из файла.
4. Затем нити должны найти максимально встречающийся байт в своем файле и добавить его в словарь resultMap.
5. Поток для чтения из файла в каждой нити должен быть закрыт.
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> names = new ArrayList<>();
        String fileName;
        while(!(fileName = reader.readLine()).equals("exit")){//1. Программа должна считывать
            names.add(fileName); //имена файлов с консоли, пока не будет введено слово "exit".
        }

        for(String s : names){//Для каждого файла создай нить ReadThread и запусти ее.
            new ReadThread(s).start();
        }

        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            HashMap<Byte, Integer> map = new HashMap<>();
            byte[] data = new byte[0];
            int max = Integer.MIN_VALUE;
            byte res = Byte.MIN_VALUE;

            try {// После запуска каждая нить ReadThread должна создать свой поток для чтения из файла.
                FileInputStream in = new FileInputStream(this.fileName);
                while(in.available() > 0){
                    data = new byte[in.available()];
                    in.read(data);
                }
                in.close();
            } catch (IOException e) {
                //NOP
            }

            for(byte b : data){//находим встречаемость каждого байта
                if(map.containsKey(b)){
                    int count = map.get(b) + 1;
                    map.put(b, count);
                } else {
                    map.put(b, 1);
                }
            }
            // Затем нити должны найти максимально встречающийся байт в своем файле и добавить его в словарь resultMap.
            for(Map.Entry<Byte, Integer> entry : map.entrySet()){
                if(entry.getValue() > max){
                    max = entry.getValue();
                    res = entry.getKey();
                }
            }

            synchronized (resultMap){
                resultMap.put(this.fileName, (int)res);
            }
        }

    }
}
