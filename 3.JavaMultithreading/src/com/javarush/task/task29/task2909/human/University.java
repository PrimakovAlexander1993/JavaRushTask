package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.List;

public class University{
    private String name;
    private int age;
    private List<Student> students= new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageGrade() == averageGrade){
                return students.get(i);
            }
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        double maxAverageGrade = students.get(0).getAverageGrade();
        int maxIndex = 0;
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getAverageGrade() > maxAverageGrade){
                maxAverageGrade = students.get(i).getAverageGrade();
                maxIndex = i;
            }
        }
        return students.get(maxIndex);
    }
    /*
    6.4. Разделение запроса и модификатора. Раздели метод getStudentWithMinAverageGradeAndExpel
    на Student getStudentWithMinAverageGrade() и void expel(Student student).
    Первый метод должен возвратить студента с минимальным средним балом, а второй - отчислить переданного студента (удалять из списка students).
     */
    //public void getStudentWithMinAverageGradeAndExpel() {
    //    //TODO:
    //}

    public Student getStudentWithMinAverageGrade(){
        double minAverageGrade = students.get(0).getAverageGrade();
        int minIndex = 0;
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getAverageGrade() < minAverageGrade){
                minAverageGrade = students.get(i).getAverageGrade();
                minIndex = i;
            }
        }
        return students.get(minIndex);
    }

    public void expel(Student student){
        students.remove(student);
    }
}