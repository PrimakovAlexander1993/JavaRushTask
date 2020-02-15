package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.


*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Solution.strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            Solution.strings.add(reader.readLine());
        }
        String result = "";
        ArrayList<String> ressArr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (Solution.strings.get(i).length() > result.length()) {
                if (!result.isEmpty()) {
                    ressArr.clear();
                }
                result = Solution.strings.get(i);
                ressArr.add(Solution.strings.get(i));
            } else if (Solution.strings.get(i).length() == result.length()) {
                ressArr.add(Solution.strings.get(i));
            }
        }
        for (int i = 0; i < ressArr.size(); i++) {
            System.out.println(ressArr.get(i));
        }

    }
}
