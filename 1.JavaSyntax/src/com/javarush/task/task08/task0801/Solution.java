package com.javarush.task.task08.task0801;

/* 
HashSet из растений
арбуз
банан
вишня
груша
дыня
ежевика
женьшень
земляника
ирис
картофель
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashSet<String> setT = new HashSet<>();
        setT.add("арбуз");
        setT.add("банан");
        setT.add("вишня");
        setT.add("груша");
        setT.add("дыня");
        setT.add("ежевика");
        setT.add("женьшень");
        setT.add("земляника");
        setT.add("ирис");
        setT.add("картофель");

        for (String s: setT){
            System.out.println(s);
        }

    }
}
