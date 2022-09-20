package br.com.guilherme.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CopiarArquivo {
    public static void main(String[] args) throws Exception {
        // InputStream fileInputStream = new FileInputStream("loremBacon.txt");
        InputStream fileInputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        // OutputStream fileOutputStream = System.out;
        OutputStream fileOutputStream = new FileOutputStream("loremBaconCopia.txt");
        Writer OutputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(OutputStreamWriter);

        String line = bufferedReader.readLine();
        while (line != null && !line.isEmpty()) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
