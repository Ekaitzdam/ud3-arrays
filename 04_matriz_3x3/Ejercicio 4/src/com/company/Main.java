package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] matriz = new int[3][3];


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Escribe un numero: ");
                int numero = Integer.parseInt(br.readLine());
                matriz[i][j] = numero;


            }
        }
        //visualizar
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.format("%4d", matriz[i][j]);

            }
            System.out.println();
        }

       /* System.out.println(" " + matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2] + "\n" + " " + matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2] + "\n" + " " + matriz[2][0] + " " + matriz[2][1] + " " + matriz[2][2] + "\n");
        */

    }
}
