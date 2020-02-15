package com.javarush.task.task25.task2506;
/*
1. Создай класс LoggingStateThread в отдельном файле. Он должен наследовать класс Thread.
2. Класс LoggingStateThread должен содержать поле нити, за которой он будет следить. Это поле должно инициализироваться через конструктор.
3. Переопредели метод run в классе LoggingStateThread.
4. После запуска класс LoggingStateThread должен выводить в консоль изменения состояния переданной нити.
5. После завершения работы наблюдаемой нити, LoggingStateThread так же должен завершить работу.
 */
public class LoggingStateThread extends Thread {
    private Thread theThread;
    private Thread.State nowState;

    public LoggingStateThread(Thread theThread) {
        this.theThread = theThread;
        nowState = theThread.getState();
    }

    @Override
    public void run() {
        Thread.State newState;
        System.out.println(nowState);
        do {
            newState = theThread.getState();
            if (newState != nowState) {
                nowState = newState;
                System.out.println(nowState);
            }
        } while (newState != State.TERMINATED);
    }

}
