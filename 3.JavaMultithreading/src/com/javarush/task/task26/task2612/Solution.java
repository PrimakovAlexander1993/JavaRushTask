package com.javarush.task.task26.task2612;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* 
Весь мир играет комедию
Написать реализацию метода someMethod():
1. попытаться захватить лок
1.1. если лок занят, то вызвать метод actionIfLockIsBusy()
1.2. если лок свободен, то:
1.2.1 вызвать метод actionIfLockIsFree()
1.2.2 отпустить лок при любых условиях, даже если actionIfLockIsFree() будет кидать исключение
Требования:
1. Класс Solution должен содержать приватное поле Lock lock.
2. Класс Solution должен содержать публичный метод ifLockIsFree().
3. Класс Solution должен содержать публичный метод ifLockIsBusy().
4. Метод someMethod() должен пытаться захватить лок.
5. Метод someMethod() должен вызвать метод ifLockIsBusy() если лок занят.
6. Метод someMethod() должен вызвать метод ifLockIsFree() если лок свободен.
7. Метод someMethod() должен отпускать лок при любых условиях, даже если ifLockIsFree() будет кидать исключение.
*/
public class Solution {
    private Lock lock = new ReentrantLock();


    public void  someMethod() {
        if (lock.tryLock()) {
            try {
                actionIfLockIsFree();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        } else {
            actionIfLockIsBusy();
        }
    }

    public void ifLockIsFree() {
    }

    public void ifLockIsBusy() {
    }

    public void actionIfLockIsFree() {
    }

    public void actionIfLockIsBusy() {
    }
}
