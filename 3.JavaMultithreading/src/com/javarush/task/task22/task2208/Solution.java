package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> params = new LinkedHashMap<>();
        params.put("name", "Ivanov");
        params.put("country", "Ukraine");
        params.put("city", "Kiev");
        params.put("age", null);
        System.out.println(getQuery(params));
    }
    public static String getQuery(Map<String, String> params) {
        String format = "%s = '%s'";
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry x : params.entrySet()) {
            if (x.getValue() != null) {
                if (stringBuilder.length() > 1) {
                    stringBuilder.append(" and ");
                }
                stringBuilder.append(String.format(format, x.getKey(), x.getValue()));
            }
        }
        return stringBuilder.toString().trim();
    }
}
