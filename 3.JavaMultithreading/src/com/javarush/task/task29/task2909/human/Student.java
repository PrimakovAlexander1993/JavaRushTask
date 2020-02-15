package com.javarush.task.task29.task2909.human;

import java.util.Date;


public class Student extends UniversityPerson{

    private double averageGrade;
    private Date beginningOfSession;
    private Date endOfSession;
    private int course;

    public Student(String name, int age, double averageGrade) {
        super(name,age);
        this.averageGrade = averageGrade;
    }

    public void live() {
        learn();
    }

    public void learn() {
    }
//1. Необходимо изменить метод incAverageGrade() класса Student с использованием сеттера и геттера для доступа к averageGrade.
    public void incAverageGrade(double delta){
        double x= getAverageGrade();
        setAverageGrade(x+=delta);
    }
    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
    public void setCourse(int course) {
        this.course = course;
    }



    public int getCourse() {
        return course;
    }

    public void setBeginningOfSession(Date date) {
        beginningOfSession=date;
    }

    public void setEndOfSession(Date date) {
        endOfSession = date;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String getPosition() {
        return "Студент";
    }
}