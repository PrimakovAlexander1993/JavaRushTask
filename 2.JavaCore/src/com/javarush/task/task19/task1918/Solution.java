package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileReader fileReader = new FileReader(reader.readLine())) {
            StringBuilder stringBuilder = new StringBuilder();
            while (fileReader.ready()) {
                stringBuilder.append((char) fileReader.read());
            }
            String text = stringBuilder.toString();
            Document doc = Jsoup.parse(text, "", Parser.xmlParser());
            Elements element = doc.select(args[0]);
            for (Element elements : element) {
                System.out.println(elements);
            }
        }
    }
}
