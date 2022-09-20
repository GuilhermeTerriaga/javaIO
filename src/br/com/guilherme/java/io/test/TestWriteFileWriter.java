package br.com.guilherme.java.io.test;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TestWriteFileWriter {
    public static void main(String[] args) throws Exception {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("lorem2.txt"));
        bufferedWriter.write("Olá!");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.append("Lorem Ipsum Bacon Spicy");
        bufferedWriter.close();
    }
}
