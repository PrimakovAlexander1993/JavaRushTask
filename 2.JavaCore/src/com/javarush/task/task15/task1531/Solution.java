package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int input = Integer.parseInt(reader.readLine());
            System.out.println(fact(input));
        }
    }

    public static int fact(int n) {
        if (n == 1) {
            return n;
        }
        if (n == 2) {
            return n;
        }
        return fact(n - 1) * n;
    }

}

