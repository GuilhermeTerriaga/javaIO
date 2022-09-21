package br.com.guilherme.java.io.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestOutputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String nome = "guilherme";
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream("file.bin"));
        objectOutputStream.writeObject(nome);
        objectOutputStream.close();

        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("file.bin"));
        String obj = (String) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(obj);

    }
}
