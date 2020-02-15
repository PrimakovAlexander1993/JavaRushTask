package com.javarush.task.task09.task0921;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/* 
Метод в try..catch
Написать программу, которая будет вводить числа с клавиатуры.
Код по чтению чисел с клавиатуры должен быть в методе readData.
Код внутри readData обернуть в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.


*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> list= new ArrayList<>();
        try {
            while (true){
                BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
                list.add(Integer.parseInt(reader.readLine()));
            }

        } catch (NumberFormatException e) {
            for (Integer x :list){
                System.out.println(x);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
