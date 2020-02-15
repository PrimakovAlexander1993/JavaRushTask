package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
Твоя ридер-обертка должна заменять все подстроки "te" на "??".

*/


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printConsole= System.out;

        ByteArrayOutputStream byteArrayOutputStream= new ByteArrayOutputStream();
        PrintStream printStream= new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);

        testString.printSomething();
        String result= byteArrayOutputStream.toString();
        System.setOut(printConsole);
        StringBuilder stringBuilder= new StringBuilder(result);
        String str =stringBuilder.toString().replace("te","??");
        System.out.println(str);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
