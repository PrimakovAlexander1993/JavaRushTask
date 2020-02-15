package com.javarush.task.task04.task0427;

/* 
Описываем числа
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,

"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,

"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.

Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reed = new BufferedReader(new InputStreamReader(System.in));
        String a = reed.readLine();
        int aa = Integer.parseInt(a);
        int b = a.length();
        String aaa = aa % 2 == 0 ? "четное" : "нечетное";
        if (aa >= 1 && aa <= 999) {
            if (b == 1) {
                System.out.println(aaa + " " + "однозначное число");
            } else if (b == 2) {
                System.out.println(aaa + " " + "двузначное число");
            } else if (b == 3) {
                System.out.println(aaa + " " + "трехзначное число");
            }
        }

    }
}
