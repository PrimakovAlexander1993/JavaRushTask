package com.javarush.task.task07.task0724;

/* 
Семейная перепись
Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human). Создай объекты
 и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human ded1=new Human("Bob",true,70);
        Human ded2=new Human("Chak",true,72);
        Human babushka1=new Human("Gressy",false,98);
        Human babushka2=new Human("Greffy",false,91);
        Human father=new Human("Daffy",true,34,ded1,babushka1);
        Human mother=new Human("Lola",false,32,ded2,babushka2);
        Human son1=new Human("Jack",true,5,father,mother);
        Human son2=new Human("Ken",true,3,father,mother);
        Human son3=new Human("Gap",true,9,father,mother);

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(babushka1.toString());
        System.out.println(babushka2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        public Human(String name,boolean sex, int age, Human father, Human mother){
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.father=father;
            this.mother=mother;
        }
        public Human(String name,boolean sex, int age){
            this.name=name;
            this.age=age;
            this.sex=sex;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















