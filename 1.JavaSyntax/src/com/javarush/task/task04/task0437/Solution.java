package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] mas ={8,8,8,8,8,8,8,8,8,8,8};
        for (int i = 1; i < mas.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(mas[i]);
            }
            System.out.println("");

        }
    }
}
