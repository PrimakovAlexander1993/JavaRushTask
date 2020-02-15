package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;


//3. Приоритет у объектов MyThread должен проставляться циклично, от MIN_PRIORITY до MAX_PRIORITY.
//4. Если у объекта MyThread установлена ThreadGroup, приоритет MyThread не должен быть выше максимального приоритета ThreadGroup.
public class MyThread extends Thread {
    private static final AtomicInteger atomicInteger = new AtomicInteger(0);

    void init() {
        int priority = atomicInteger.incrementAndGet();
        if (priority > getThreadGroup().getMaxPriority()) {
            if (priority > Thread.MAX_PRIORITY) {
                atomicInteger.set(1);
                priority = Thread.MIN_PRIORITY;
            } else {
                priority = getThreadGroup().getMaxPriority();
            }
        }
        setPriority(priority);
    }

    public MyThread() {
        init();
    }

    public MyThread(Runnable target) {
        super(target);
        init();
    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        init();
    }

    public MyThread(String name) {
        super(name);
        init();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        init();
    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        init();
    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        init();
    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        init();
    }
}
