package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* 
AmigoOutputStream
1 Измени класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используй наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 Вызвать метод flush().
2.2 Дописать следующий текст "JavaRush © All rights reserved.", используй метод getBytes().
2.3 Закрыть поток методом close().


*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream amigo;

    public AmigoOutputStream(FileOutputStream amigo) throws FileNotFoundException {
        super(fileName);
        this.amigo = amigo;
    }

    @Override
    protected void finalize() throws IOException {
        super.finalize();
    }

    @Override
    public FileChannel getChannel() {
        return super.getChannel();
    }

    @Override
    public void close() throws IOException {
        amigo.flush();
        String string = "JavaRush © All rights reserved.";
        amigo.write(string.getBytes());
        amigo.close();
    }


    @Override
    public void flush() throws IOException {
        amigo.flush();
    }

    @Override
    public void write(int b) throws IOException {
        amigo.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        amigo.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        amigo.write(b, off, len);
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
