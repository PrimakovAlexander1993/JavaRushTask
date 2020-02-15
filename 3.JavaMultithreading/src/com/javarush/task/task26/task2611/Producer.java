package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

/*
В отдельном файле создайте класс Producer, который будет:
1. каждые полсекунды добавлять в ConcurrentHashMap ключ и значение, где ключ - счетчик начиная с 1, значение - фраза: "Some text for i" , пример "Some text for 1".
2. при возникновении исключения выводить в консоль: "[THREAD_NAME] thread was terminated", пример "[thread-1] thread was terminated".


Требования:
1. Класс Producer должен быть создан в отдельном файле.
2. Класс Producer должен реализовывать интерфейс Runnable.
3. Класс Producer должен содержать приватное поле ConcurrentHashMap<String, String> map.
4. Класс Producer должен содержать конструктор с одним параметром, инициализирующий поле map.
5. Метод run() класса Producer должен каждые полсекунды добавлять в ConcurrentHashMap ключ и значение согласно заданию.
6. Метод run() класса Producer должен при возникновении исключения выводить в консоль "[THREAD_NAME] thread was terminated".
 */
public class Producer implements Runnable{
    private ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }
    int i=0;
    @Override
    public void run() {
        try {
            while (true){
                i++;
                map.put(String.valueOf(i),"Some text for " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " thread was terminated");
        }
    }
}
