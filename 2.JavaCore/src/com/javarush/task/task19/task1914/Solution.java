package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(consoleStream);
        String result = outputStream.toString().replaceAll("\\r\\n", "");
        String resultMod = result.replaceAll(" ", "");//Удаляем все пробелы в строке
        String[] split = resultMod.split("\\W");//Вылавливаем все числа из строки(любой не словесный символ)
        int res;
        int firstDigit = Integer.parseInt(split[0]);
        int secondDigit = Integer.parseInt(split[1]);
        String sing = result.replaceAll("[^\\+\\-\\*]", "");//Находим знак
        switch (sing) {
            case "+":
                res = firstDigit + secondDigit;
                System.out.println(result + res);
                break;
            case "-":
                res = firstDigit - secondDigit;
                System.out.println(result + res);
                break;
            case "*":
                res = firstDigit * secondDigit;
                System.out.println(result + res);
                break;
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

