package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        int digit =Integer.parseInt(reader.readLine());
        String str= reader.readLine();
        System.out.println(str + " захватит мир через " + digit + " лет. Му-ха-ха!");


    }
}
