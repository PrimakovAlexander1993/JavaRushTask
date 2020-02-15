package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
Подсказка:
Не забудь импортировать класс: java.util.ArrayList;
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        ArrayList<String> resArr = new ArrayList<>();
        String result = list.get(0);


        for (int i = 1; i < 5; i++) {
            if (list.get(i).length() < result.length()) {
                if (!result.isEmpty()) {
                    resArr.clear();
                }
                result=list.get(i);
                resArr.add(result);

            }else if (list.get(i).length()==result.length()){
                resArr.add(list.get(i));
               // resArr.add(result);
            }
        }
        for (int i = 0; i < resArr.size(); i++) {
            System.out.println(resArr.get(i));
        }

        if (resArr.isEmpty()){
            System.out.println(result);
        }
    }
}
