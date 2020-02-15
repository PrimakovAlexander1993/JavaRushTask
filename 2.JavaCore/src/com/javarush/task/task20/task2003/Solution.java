package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполни карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуй логику записи в файл и чтения из файла для карты properties.


Требования:
1. Метод fillInPropertiesMap должен считывать данные с консоли.
2. Метод fillInPropertiesMap должен создавать FileInputStream, передавая считанную строку в качестве параметра.
3. Метод fillInPropertiesMap должен вызывать метод load передавая только что созданный FileInputStream в качестве параметра.
4. Метод save должен сохранять карту properties в полученный в качестве параметра объект типа OutputStream.
5. Метод load должен восстанавливать состояние карты properties из полученного в качестве параметра объекта типа InputStream.
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public void fillInPropertiesMap() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            load(new FileInputStream(reader.readLine()));

        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public void save(OutputStream outputStream) throws Exception {
        Properties prop = new Properties();
        try {
            for (Map.Entry<String, String> map : properties.entrySet()) {
                prop.put(map.getKey(), map.getValue());
            }
            prop.store(outputStream, null);
            outputStream.close();
        } catch (IOException io) {
            io.printStackTrace();
        }

    }

    public void load(InputStream inputStream) throws Exception {
        Properties prop = new Properties();
        try {
            prop.load(inputStream);
            for (String x : prop.stringPropertyNames())
                properties.put(x, prop.getProperty(x));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
