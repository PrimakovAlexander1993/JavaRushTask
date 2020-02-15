package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;


public class FileConsoleWriter extends FileWriter {
    private FileWriter fileWriter;

    public FileConsoleWriter(String fileName) throws IOException {
        super(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        super(fileName, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        super(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        super(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) {
        super(fd);
    }

    private final int writeBufferSize = 1024;
    private char[] writeBuffer;

    public void write(char[] cbuf, int off, int len) throws IOException {
        System.out.println(String.copyValueOf(cbuf).substring(off, off + len));
        super.write(cbuf, off, len);
    }

    public void write(String str) throws IOException {
        write(str, 0, str.length());
        System.out.println(str);
    }

    public void write(String str, int off, int len) throws IOException {
        System.out.println(str.substring(off, off + len));
        char cbuf[];
        if (len <= writeBufferSize) {
            if (writeBuffer == null) {
                writeBuffer = new char[writeBufferSize];
            }
            cbuf = writeBuffer;
        } else {
            cbuf = new char[len];
        }
        str.getChars(off, (off + len), cbuf, 0);
        write(cbuf, 0, len);
    }

    public void write(int c) throws IOException {
        if (writeBuffer == null) {
            writeBuffer = new char[writeBufferSize];
        }
        writeBuffer[0] = (char) c;
        write(writeBuffer, 0, 1);
        System.out.println(c);
    }

    public void write(char[] cbuf) throws IOException {
        write(cbuf, 0, cbuf.length);
        System.out.println(String.valueOf(cbuf));
    }

    public void close() throws IOException {
        super.close();
    }


    public static void main(String[] args) {
    }
}
