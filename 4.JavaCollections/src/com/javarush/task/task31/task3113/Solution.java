package com.javarush.task.task31.task3113;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/* 
Что внутри папки?
*/
public class Solution {

    static class FileVisitor extends SimpleFileVisitor<Path> {
        int allBytes = 0;
        int cntDirectories = -1;
        int cntFiles = 0;

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
            cntFiles++;
            try {
                allBytes += Files.size(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return FileVisitResult.CONTINUE;
        }

        @Override
        public FileVisitResult preVisitDirectory(Path file, BasicFileAttributes attrs) {
            cntDirectories++;
            return FileVisitResult.CONTINUE;
        }
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Path directory = null;
        try {
            directory = Paths.get(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!Files.isDirectory(directory)) {
            System.out.println(directory.toAbsolutePath() + " - " + "не папка");
        }
        FileVisitor fileVisitor = new FileVisitor();
        try {
            Files.walkFileTree(directory, fileVisitor);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Всего папок - " + fileVisitor.cntDirectories);
        System.out.println("Всего файлов - " + fileVisitor.cntFiles);
        System.out.println("Общий размер - " + fileVisitor.allBytes);
    }
}
