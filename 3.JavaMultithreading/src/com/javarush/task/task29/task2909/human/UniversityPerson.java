package com.javarush.task.task29.task2909.human;

import java.util.List;

public class UniversityPerson extends Human {
    public UniversityPerson(String name, int age) {
        super(name, age);

    }

    private University university;

    public void setUniversity(University university) {
        this.university = university;
    }

    public University getUniversity() {
        return university;
    }


    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }


    @Override
    public List<Human> getChildren() {
        return super.getChildren();
    }

    @Override
    public void addChild(Human human) {
        super.addChild(human);
    }

    @Override
    public void printSize() {
        super.printSize();
    }

    @Override
    public void live() {
        super.live();
    }

    @Override
    public void removeChild(Human human) {
        super.removeChild(human);
    }


    @Override
    public void setAge(int age) {
    }

}
