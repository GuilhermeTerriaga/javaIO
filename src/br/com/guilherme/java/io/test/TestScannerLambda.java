package br.com.guilherme.java.io.test;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TestScannerLambda {
    public static void main(String[] args) throws Exception {
        Scanner scanner =
                new Scanner(new File("arq.csv"), "UTF-8").useDelimiter(System.lineSeparator());
        scanner.forEachRemaining(line -> {
            Scanner linhaScanner = new Scanner(line).useDelimiter(",").useLocale(Locale.US);
            String tipoConta = linhaScanner.next();
            int numeroConta = linhaScanner.nextInt();
            int agenciaConta = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldoConta = linhaScanner.nextDouble();
            System.out.format(new Locale("pt", "BR"), "%s - %04d-%d, %10s: %.2f%n", tipoConta,
                    numeroConta, agenciaConta, titular, saldoConta);
            linhaScanner.close();
        });
        scanner.close();

        // Scanner scanner =
        // new Scanner(new File("arq.csv"), "UTF-8").useDelimiter(System.lineSeparator());
        // scanner.forEachRemaining(line -> new Scanner(line).useDelimiter(",").useLocale(Locale.US)
        // .forEachRemaining(data -> System.out.println(data)));

        // scanner.close();
    }
}
