package com.javarush.task.task30.task3002;


/*
Осваиваем методы класса Integer
Используя метод Integer.parseInt(String, int) реализуй логику метода convertToDecimalSystem,
который должен переводить переданную строку в десятичное число и возвращать его в виде строки.


Требования:
1. В классе Solution должен существовать метод convertToDecimalSystem(String), возвращающий String.
2. Метод convertToDecimalSystem(String) должен иметь модификаторы доступа: public, static.
3. Метод convertToDecimalSystem(String) должен вызывать метод Integer.parseInt(String, int).
4. Метод convertToDecimalSystem(String) должен переводить переданную строку в десятичное число и возвращать его в виде строки.
*/
public class Solution {

    public static void main(String[] args) {
        System.out.println(convertToDecimalSystem("0x16")); //22
        System.out.println(convertToDecimalSystem("012"));  //10
        System.out.println(convertToDecimalSystem("0b10")); //2
        System.out.println(convertToDecimalSystem("62"));   //62
    }

    public static String convertToDecimalSystem(String s) {
        //напишите тут ваш код
        int radix;
        String strForCheck = "";
        if (s.startsWith("-")) {
            strForCheck += "-";
            s = s.substring(1);
        }
        if (s.startsWith("0x")) {
            strForCheck += s.substring(2);
            radix = 16;
        } else if (s.startsWith("0b")) {
            strForCheck += s.substring(2);
            radix = 2;
        } else if (s.startsWith("0")) {
            strForCheck += s;
            radix = 8;
        } else {
            strForCheck += s;
            radix = 10;
        }

        return Integer.toString(Integer.parseInt(strForCheck, radix));
    }
}
