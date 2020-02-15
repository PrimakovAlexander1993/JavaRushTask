package com.javarush.task.task25.task2512;

/*
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        StringBuilder sb = new StringBuilder();
        do {
            sb.insert(0, e.getClass().getName() + ": " + e.getMessage() + "\n");
            e = e.getCause();
        }
        while (e != null);
        System.out.print(sb.toString());
    }

    public static void main(String[] args) throws Exception {
        Thread.setDefaultUncaughtExceptionHandler(new Solution());
        throw new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI")));
    }
}
