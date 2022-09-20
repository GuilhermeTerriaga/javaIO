package br.com.guilherme.java.io.test;

import java.io.PrintWriter;

public class TestWritePrintWriteOrStream {
    public static void main(String[] args) throws Exception {
        // PrintStream printStream = new PrintStream("lorem2.txt");
        PrintWriter printWriter = new PrintWriter("lorem2.txt");
        printWriter.println("Olá! com PrintStream");
        printWriter.println("Lorem Ipsum Bacon Spicy");
        printWriter.close();
    }
}
