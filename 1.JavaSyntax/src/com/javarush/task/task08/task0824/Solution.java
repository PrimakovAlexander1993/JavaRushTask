package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human human9 =new Human("chil3",true,5);
        Human human8 =new Human("chil2",true,3);
        Human human7 =new Human("chil1",false,4);
        Human human6 =new Human("Mother",false,67 ,human7,human8, human9);
        Human human5 =new Human("Father",true,44 ,human7,human8, human9);
        Human human4 =new Human("Gren2",false,70,human5);
        Human human3 =new Human("Gren1",false,70,human6);
        Human human2 =new Human("Ded2",true,77 ,human5);
        Human human1 =new Human("Ded1",true,73,human6);

        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println(human5.toString());
        System.out.println(human6.toString());
        System.out.println(human7.toString());
        System.out.println(human8.toString());
        System.out.println(human9.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children =new ArrayList<>();


        public Human(String name, boolean sex, int age, Human ...  human) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            Collections.addAll(this.children,human);
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
