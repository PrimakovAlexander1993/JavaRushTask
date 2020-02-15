package com.javarush.task.task18.task1827;

/* 
Прайсы
CrUD для таблицы внутри файла.
Считать с консоли имя файла для операций CrUD.

Программа запускается со следующим набором параметров:
-c productName price quantity

Значения параметров:
где id - 8 символов.
productName - название товара, 30 символов.
price - цена, 8 символов.
quantity - количество, 4 символа.
-c - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле.

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity

Данные дополнены пробелами до их длины.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        if (args[0].equals("-c")) {
            try(BufferedReader r = new BufferedReader(new InputStreamReader(System.in))){
                String fileName = r.readLine();
                int id = getID(fileName);
                String res = getStr(args, id);
                try(FileWriter wr = new FileWriter(fileName, true)){
                    wr.append(res);
                }
            }
        }
    }


    public static int getID(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int id = 0;
        int tid = 0;
        String tmp;
        while ((tmp = reader.readLine()) != null) {
            if (tmp.substring(0, 8).contains(" ")) tid = Integer.parseInt(tmp.substring(0, tmp.indexOf(" ")));
            else tid = Integer.parseInt(tmp.substring(0, 8));
            if (tid > id) id = tid;
        }
        id++;
        return id;
    }


    public static String getStr(String[] args, int id) {
        String ids = String.valueOf(id);
        String productName = args[1];
        String price = args[2];
        String quantity = args[3];

        while (ids.length() < 8) {
            ids = ids + " ";
        }

        while (productName.length() < 30) {
            productName = productName + " ";
        }
        while (price.length() < 8) {
            price = price + " ";
        }
        while (quantity.length() < 4) {
            quantity = quantity + " ";
        }

        return ids + productName + price + quantity;

    }


}