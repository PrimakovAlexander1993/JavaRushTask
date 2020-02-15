package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1= new Man("Bob", 22, "Los-Angeles");
        Man man2= new Man("Cha", 32, "Los-Angeles");
        Woman woman1= new Woman("Li", 24,"Moscow");
        Woman woman2= new Woman("Po", 22,"Moscow");
        System.out.println(man1.toString());
        System.out.println(man2.toString());
        System.out.println(woman1.toString());
        System.out.println(woman2.toString());

    }

    //напишите тут ваш код
    public static class Man{
        String name,address;
        int age;
        public Man(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public String toString(){
            return name + " " + age + " " + address;
        }

    }
    public static class Woman{
        String name,address;
        int age;
        public Woman(String name, int age, String address){
            this.name=name;
            this.age=age;
            this.address=address;
        }
        public String toString(){
            return name + " " + age + " " + address;
        }
    }
}
