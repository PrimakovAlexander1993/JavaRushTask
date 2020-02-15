package com.javarush.task.task22.task2212;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber !=null){
            String regularExpr ="(\\+?\\d+\\(?\\d{3}\\)?\\d{2}\\-?\\d{2}\\-?\\d{2,3})";
            Pattern p= Pattern.compile(regularExpr);
            Matcher matcher=p.matcher(telNumber);
            return matcher.matches();
        }else {
            return false;
        }

    }

    public static void main(String[] args)throws IOException {
    }
}
