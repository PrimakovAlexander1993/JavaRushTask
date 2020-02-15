package com.javarush.task.task29.task2912;
/*
Требования:
1. Класс AbstractLogger должен быть публичным и абстрактным.
2. Класс AbstractLogger должен поддерживать интерфейс Logger.
3. Необходимо поднять поля level и next в класс AbstractLogger.
4. Необходимо поднять методы setNext(Logger) и inform(String, int) в класс AbstractLogger.
5. Вывод программы должен остаться неизменным.
 */
public abstract class AbstractLogger implements Logger {
    int level;
    Logger next;
    public void setNext(Logger next) {
        this.next = next;
    }
    public void inform(String message, int level) {
        if (this.level <= level) {
            info(message);
        }
        if (next != null) {
            next.inform(message, level);
        }
    }

}
