package com.javarush.task.task20.task2025;

import java.util.ArrayList;

/*
Алгоритмы-числа
*/
public class Solution {

    public static void main(String[] args) {
        Long t0 = System.currentTimeMillis();
        int[] numbers = getNumbers(100000000);
        Long t1 = System.currentTimeMillis();
        System.out.println("time: " + (t1 - t0) / 1000d + " sec");
        System.out.println("memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / (1024 * 1024) + " mb");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
    }

    public static int[] getNumbers(int N) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 1; i < N; i++) {
            int s = 0,
                    k = i,
                    n = 0;
            while (k != 0) {
                k = k / 10;
                n++;
            }
            k = i;
            while (k != 0) {
                int p = k % 10;
                k = k / 10;
                if (p != 0) {
                    int buf = 1;
                    for (int g = 0; g < n; g++)
                        buf = buf*p;
                    s = s + buf;
                }
            }
            if (s == i) {
                arrayList.add(i);
            }
        }
        int[] result = new int[arrayList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arrayList.get(i);
        }
        return result;
    }
}