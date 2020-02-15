package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        URL url = new URL(urlString); // создали объект url для переданной ссылки
        Path resultFile=Paths.get(urlString);

        try (InputStream downloadStream = url.openStream()) {

            String fileName = urlString.substring(urlString.lastIndexOf("/") + 1);

            resultFile = Paths.get(downloadDirectory + "/" + fileName);

            Path tmp = Files.createTempFile("temp-", ".tmp");

            Files.copy(downloadStream, tmp, StandardCopyOption.REPLACE_EXISTING);

            if (!Files.exists(downloadDirectory)) {
                Files.createDirectories(downloadDirectory);
            }

            if (!Files.exists(resultFile)) {
                Files.move(tmp, resultFile);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultFile;
    }
}