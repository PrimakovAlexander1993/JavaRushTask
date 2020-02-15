package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(7, 14);
    }

    public static void closeToTen(int a, int b) {
        int n = 0;
        int c = 0;
        if (a > 10){
            n = a - 10;
        } else if (a < 10){
            n = 10 - a;
        } if (b > 10) {
            c = b - 10;
        } else if (b < 10){
            c = 10 - b;
        } if (abs(n) < abs(c)){
            System.out.println(a);
        } else if (abs(c) < abs(n)) {
            System.out.println(b);
        } if (abs(n) == abs(c)) {
            System.out.println(a);
        }
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}