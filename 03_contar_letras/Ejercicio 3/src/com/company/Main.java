package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void contarLetras(String texto, String abecedario, int[] recuento) {

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            for (int j = 0; j < abecedario.length(); j++) {
                if (abecedario.charAt(j) == letra) {
                    recuento[j] += 1;
                }

            }
        }


    }

    public static void visualizarRecuento(String abecedario, int[] recuento) {
        for (int i = 0; i < recuento.length; i++) {
            if (recuento[i] > 0) {
                System.out.println(abecedario.charAt(i) + ": " + recuento[i]);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String texto;

        System.out.print("Introduzca un texto: ");

        texto = br.readLine().toUpperCase();

        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int[] recuento = new int[abecedario.length()];

        contarLetras(texto, abecedario, recuento);

        visualizarRecuento(abecedario, recuento);


    }
}
