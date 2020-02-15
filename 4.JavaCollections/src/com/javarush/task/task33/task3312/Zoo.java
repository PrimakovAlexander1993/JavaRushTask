package com.javarush.task.task33.task3312;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;
//Требования:
//1. Класс Zoo.Animal должен быть отмечен аннотацией @JsonTypeInfo.
//2. Класс Zoo.Animal должен быть отмечен аннотацией @JsonSubTypes.
//3. Класс Zoo.Dog должен быть отмечен аннотацией @JsonTypeName.
//4. Класс Zoo.Cat должен быть отмечен аннотацией @JsonTypeName.
//5. При сериализации в JSON всем объектам списка animals должен быть добавлен тип и сохранен основной формат (пример в задании).

public class Zoo {
    public List<Animal> animals = new ArrayList<>();

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
    @JsonSubTypes({
            @JsonSubTypes.Type(value = Zoo.Dog.class, name = "dog"),
            @JsonSubTypes.Type(value = Zoo.Cat.class, name = "cat"),

    })
    public static class Animal {
        public Animal(String name) {
            this.name = name;
        }

        public String name;
    }

    @JsonTypeName("dog")
    public static class Dog extends Animal {

        public double barkVolume;

        public Dog(String name) {
            super(name);
        }
    }

    @JsonTypeName("cat")
    public static class Cat extends Animal {
        boolean likesCream;
        public int lives;

        public Cat(String name) {
            super(name);
        }
    }
}