package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        String word_1, word_2;
        int count;
        for (int i = 0; i < list.size(); i++) {
            word_1 = list.get(i); //в ворд1 записали итый эл-т
            count = 1;
            for (int j = i + 1; j < list.size(); j++) {
                word_2 = list.get(j);
                if (word_1.equals(word_2)) {
                    count++;
                    list.remove(j);
                    j--;
                }
            }
            result.put(word_1, count);
        }
        return result;
    }

}

