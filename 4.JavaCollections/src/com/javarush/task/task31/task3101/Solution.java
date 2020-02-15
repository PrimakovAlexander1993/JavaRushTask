package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) {
        File path = new File(args[0]);//путь к директории
        ArrayList<File> result = vozvratFile(path);//тут все файлы в том числе из поддиректорий
        Collections.sort(result);

        File resultFileAbsolutePath = new File(args[1]); //файл который содержится в результате
        File allFilesContent = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);

        try (FileOutputStream fileOutputStream = new FileOutputStream(allFilesContent)) {
            for (File file : result) {
                try (FileInputStream inputStream = new FileInputStream(file)) {
                    while (inputStream.available() > 0) {
                        fileOutputStream.write(inputStream.read());
                    }
                    byte[] bytes = System.lineSeparator().getBytes();
                    fileOutputStream.write(bytes);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<File> vozvratFile(File path) {
        ArrayList<File> result = new ArrayList<>();//сюда будем складывать файлы
        for (File file : path.listFiles()) { //Возвращает массив файлов, которые содержатся в директории
            if (file.isFile() && file.length() <= 50) {
                result.add(file);
            }
            if (file.isDirectory()) {
                ArrayList<File> result1 = vozvratFile(file);
                result.addAll(result1);
            }
        }
        return result;
    }
}
