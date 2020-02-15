package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
        printMatrix("F",3,"w");
        printMatrix("F","d","e");
        printMatrix(2,"d","e");
        printMatrix(2,3,3.5);
        printMatrix(2.5,3,3.5);
        printMatrix(2,3.6,3.5);
        printMatrix(2.5,3.4,"w");
        printMatrix(2.5,3,"w");

    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(String m, int n, String value){
        System.out.println(m + n + value);

    }
    public static void printMatrix(int m, String n, String value){
        System.out.println(m + n + value);

    }
    public static void printMatrix(String m, String n, String value){
        System.out.println(m + n + value);

    }
    public static void printMatrix(double m, int n, double value){
        System.out.println(m + n + value);

    }
    public static void printMatrix(double m, double n, String value){
        System.out.println(m + n + value);

    }
    public static void printMatrix(int m, double n, double value){
        System.out.println(m + n + value);

    }
    public static void printMatrix(double m, int n, String value){
        System.out.println(m + n + value);

    }
    public static void printMatrix(int m, int n, double value){
        System.out.println(m + n + value);

    }

}
