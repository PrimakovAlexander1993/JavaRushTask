package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name,city;
        private boolean sex, havePet;
        private int age, numberHouse;

        public Human(String name, String city, boolean sex, boolean havePet,int age, int numberHouse){ //1
            this.age=age;
            this.city=city;
            this.havePet=havePet;
            this.name=name;
            this.numberHouse=numberHouse;
            this.sex=sex;
        }
        public  Human(String name){//3
            this.name=name;
            this.sex=true;
        }
        public Human(String name, String city){//4
            this.name=name;
            this.city=city;
        }
        public Human(String name, String city, boolean sex){//5
            this.name=name;
            this.city=city;
            this.sex=sex;
        }
        public Human(String name, String city, boolean sex, boolean havePet){//6
            this.name=name;
            this.city=city;
            this.sex=sex;
            this.havePet=havePet;
        }
        public Human(String name, String city, boolean sex, boolean havePet,int age){//6
            this.name=name;
            this.city=city;
            this.sex=sex;
            this.havePet=havePet;
            this.age=age;
        }
        public Human(Human hum){ //7
            this.name=hum.name;
        }
        public Human(Human hum, boolean sex){ //8
            this.name=hum.name;
            this.sex=sex;
        }
        public Human(Human hum, boolean sex, boolean havePet){ //9
            this.name=hum.name;
            this.sex=sex;
            this.havePet=havePet;
        }
        public Human(Human hum, boolean sex, boolean havePet, String city){ //10
            this.name=hum.name;
            this.sex=sex;
            this.havePet=havePet;
            this.city=city;
        }

    }
}
