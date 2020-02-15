package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        /*--- from keyboard --- */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        /*--- /from keyboard --- */

        /*--- from file (just for debug) ---*/
//        Scanner sc = new Scanner(new File("YOUR-FILE-PATH"));
//        List<String> list = new ArrayList<>();
//        while (sc.hasNextLine()) {
//            list.add(sc.nextLine());
//        }
        /*--- /from file (just for debug) ---*/

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // go through the array
        int length = array.length;
        int maxPos, minPos, comparableFirst, comparableSecond;
        String buffer;

        int counter = 0;
        for (int i = 0; i < length; i++, counter++) {
            if (isNumber(array[i])) { // if string is number
                // find greatest number and put on current position
                maxPos = i;

                for (int j = i + 1; j < length; j++) {
                    // compare each next number in array with current one
                    if (isNumber(array[j])) {
                        comparableFirst = Integer.parseInt(array[j]);
                        comparableSecond = Integer.parseInt(array[maxPos]);

                        if (comparableFirst > comparableSecond) {
                            // remember max position
                            maxPos = j;
                        }
                    }
                }

                // exchange current item with item on max position
                if (maxPos != i) {
                    buffer = array[i];
                    array[i] = array[maxPos];
                    array[maxPos] = buffer;
                }
            } else { // if string is string
                // find smallest string and put on current position
                minPos = i;

                for (int j = i + 1; j < length; j++) {
                    // compare each next string in array with current one
                    if (!isNumber(array[j]) && !isGreaterThan(array[j], array[minPos])) {
                        // remember min position
                        minPos = j;
                    }
                }

                // exchange current item with item on min position
                if (minPos != i) {
                    buffer = array[i];
                    array[i] = array[minPos];
                    array[minPos] = buffer;
                }
            }
        }
    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    //строка - это на самом деле число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (
                    (i != 0 && c == '-') || //есть '-' внутри строки
                            (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
            ) {
                return false;
            }
        }

        return true;
    }
}
