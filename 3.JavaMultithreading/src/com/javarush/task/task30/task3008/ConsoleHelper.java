package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//В классе ConsoleHelper должен быть реализован статический метод writeMessage(String message), выводящий сообщение на консоль.
    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() {
        String s = null;
        boolean b = true;
        while (b) {
            try {
                s = reader.readLine();
                b = false;
            } catch (IOException e) {
                System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
                b = true;
            }
        }

        return s;
    }
    public static int readInt(){
        int digit = 0;
        boolean b = true;
        while (b) {
            try {
                digit = Integer.parseInt(readString());
                b = false;
            } catch (NumberFormatException e) {
                System.out.println("Произошла ошибка при попытке ввода числа. Попробуйте еще раз.");
                b = true;
            }
        }

        return digit;
    }
}
