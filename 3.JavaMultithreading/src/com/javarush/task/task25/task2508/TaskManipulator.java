package com.javarush.task.task25.task2508;
/*
Требования:
1. Класс TaskManipulator должен реализовывать интерфейсы Runnable и CustomThreadManipulator.
2. Метод run должен каждые 100 миллисекунд выводить имя исполняемой нити в консоль.
3. Класс TaskManipulator должен иметь внутреннее поле типа Thread.
4. Метод start должен создавать, сохранять во внутреннее поле и запускать нить с именем, которое передано через аргумент метода.
5. Метод stop должен прерывать последнюю созданную классом TaskManipulator нить.
 */

public class TaskManipulator implements Runnable, CustomThreadManipulator {
    private Thread currentThread;

    @Override
    public void run() {
        while (!currentThread.isInterrupted()) {
            try {
                System.out.println(currentThread.getName());
                Thread.sleep(100);
            } catch (InterruptedException e) {
                currentThread.interrupt();
            }
        }
    }

    @Override
    public void start(String threadName) {
        currentThread = new Thread(this, threadName);
        currentThread.start();
    }

    @Override
    public void stop() {
        currentThread.interrupt();
    }
}
