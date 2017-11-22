package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double media = 0, minimo = 9999999, maximo = 0, temperatura2;

        double[] temperatura = new double[24];

        for (int i = 0; i < temperatura.length; i++) {
            temperatura[i] = 0;
            System.out.print("Introduce la temperatura de la hora " + i + ": ");
            temperatura2 = Double.parseDouble(br.readLine());
            if (maximo < temperatura2) {
                maximo = temperatura2;
            } else if (minimo > temperatura2) {
                minimo = temperatura2;
            } else {

            }
            media = media + temperatura2;


        }
        media = media / 24;

        System.out.println("El maximo es: " + maximo);

        System.out.println("El minimo es: " + minimo);

        System.out.println("La media es: " + media);


    }
}
