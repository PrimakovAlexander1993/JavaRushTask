package com.javarush.task.task14.task1406;

/* 
Без ошибок
Инициализировать объект obj таким классом, чтобы метод main выполнился без ошибок.


*/

public class Solution {
    public static void main(String[] args) {
        Object obj = new Jerry();//Add your code here

        Mouse mouse = (Mouse) obj;
        GrayMouse grayMouse = (GrayMouse) mouse;
        Jerry jerry = (Jerry) grayMouse;

        printClasses(obj, mouse, grayMouse, jerry);

    }

    public static void printClasses(Object obj, Mouse mouse, GrayMouse greyMouse, Jerry jerry) {
        System.out.println(jerry.getClass().getSimpleName());
        System.out.println(greyMouse.getClass().getSimpleName());
        System.out.println(mouse.getClass().getSimpleName());
        System.out.println(obj.getClass().getSimpleName());
    }

    static class Mouse {
    }

    static class GrayMouse extends Mouse {
    }

    static class Jerry extends GrayMouse {
    }
}
