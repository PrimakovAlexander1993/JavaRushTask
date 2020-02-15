package com.javarush.task.task20.task2021;

import java.io.*;

/* 
Сериализация под запретом
Требования:
1. Класс Solution должен поддерживать интерфейс Serializable.
2. Класс SubSolution должен быть создан внутри класса Solution.
3. Класс SubSolution должен быть потомком класса Solution.
4. При попытке сериализовать объект типа SubSolution должно возникать исключение NotSerializableException.
5. При попытке десериализовать объект типа SubSolution должно возникать исключение NotSerializableException.
*/
public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        private void writeObject(ObjectOutput out) throws NotSerializableException{
                throw new NotSerializableException();
            }
        }
        private void readObject(ObjectInput input)throws NotSerializableException{
            throw new NotSerializableException();
    }


    public static void main(String[] args) {

    }
}
