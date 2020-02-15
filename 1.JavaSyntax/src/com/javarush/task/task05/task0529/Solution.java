package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;



/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));

        int sum=0;
        while (true){
            String string =reader.readLine();

            if (string.equals("сумма")){
                break;
            }else {
                int digit= Integer.parseInt(string);
                sum +=digit;
            }
        }
        System.out.println(sum);



    }
}
