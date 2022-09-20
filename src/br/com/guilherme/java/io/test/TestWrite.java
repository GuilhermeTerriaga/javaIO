package br.com.guilherme.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestWrite {
    public static void main(String[] args) throws Exception {
        OutputStream fileOutputStream = new FileOutputStream("loremBacon2.txt");
        Writer OutputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(OutputStreamWriter);

        bufferedWriter.write("Olá!");
        bufferedWriter.newLine();
        bufferedWriter.append("Lorem Ipsum Bacon Spicy");
        bufferedWriter.close();
    }
}
