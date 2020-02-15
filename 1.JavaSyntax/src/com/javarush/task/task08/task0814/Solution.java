package com.javarush.task.task08.task0814;

import java.util.*;

/* 
Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.


*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> ss = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            ss.add(i);
        }
        return ss;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код

        Iterator<Integer> iterator = set.iterator();
        Integer a;
        while (iterator.hasNext()) {
            a = iterator.next();
            if (a.compareTo(10) > 0) iterator.remove();
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
