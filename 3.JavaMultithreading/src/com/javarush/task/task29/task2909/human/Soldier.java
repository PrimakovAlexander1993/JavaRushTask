package com.javarush.task.task29.task2909.human;

import java.util.List;

public class Soldier extends Human {
    public Soldier(String name, int age) {
        super(name,age);
    }
    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void removeChild(Human human) {
        super.removeChild(human);
    }
    //В методе live класса Soldier нужно вызвать метод fight класса Soldier.
    @Override
    public void live() {
        fight();
    }

    public void fight() {
       
    }

    @Override
    public void printSize() {
        super.printSize();
    }


    @Override
    public void addChild(Human human) {
        super.addChild(human);
    }

    @Override
    public List<Human> getChildren() {
        return super.getChildren();
    }


    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }


}
