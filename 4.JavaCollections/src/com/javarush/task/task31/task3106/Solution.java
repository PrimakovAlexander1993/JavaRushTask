package com.javarush.task.task31.task3106;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args)throws IOException {
        List<String> filesPath = new ArrayList<>();
        for (int i = 1; i < args.length; i++) {
            filesPath.add(args[i]);
        }
        Collections.sort(filesPath);
        Vector<FileInputStream> vector = new Vector<>();
        for (String file : filesPath) {
            vector.addElement(new FileInputStream(file));
        }

        ZipInputStream zipIS = new ZipInputStream(new SequenceInputStream(vector.elements()));
        ZipEntry entry;

        FileOutputStream fos = new FileOutputStream(args[0]);
        while ((entry = zipIS.getNextEntry()) != null) {
            byte[] buffer = new byte[10000];
            int b;

            while((b = zipIS.read(buffer)) != -1) {
                fos.write(buffer, 0, b);
            }
        }


        zipIS.close();
        fos.close();

    }
}
