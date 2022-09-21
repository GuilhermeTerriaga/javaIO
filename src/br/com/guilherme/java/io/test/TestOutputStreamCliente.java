package br.com.guilherme.java.io.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestOutputStreamCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Cliente cliente = new Cliente();
        // cliente.setNome("nome");
        // cliente.setCpf("cpf");
        // cliente.setProfissao("profissao");
        // ObjectOutputStream objectOutputStream =
        // new ObjectOutputStream(new FileOutputStream("file.bin"));
        // objectOutputStream.writeObject(cliente);
        // objectOutputStream.close();

        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream("file.bin"));
        Cliente obj = (Cliente) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(obj.getNome());

    }
}
