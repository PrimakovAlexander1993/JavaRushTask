package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Какое сегодня число?
Ввести с клавиатуры дату в формате "2013-08-18"
Вывести на экран введенную дату в виде "AUG 18, 2013".
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sp.parse(reader.readLine());
        System.out.println(new SimpleDateFormat("MMM dd, yyyy").format(date).toUpperCase());

    }
}
