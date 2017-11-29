package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int filas = 0, columnas = 0;

        int[][] matriz = new int[3][3];


        for (int i = 0; i < 3; i++) {


            for (int j = 0; j < 3; j++) {
                System.out.print("Escribe un numero: ");
                int numero = Integer.parseInt(br.readLine());
                matriz[i][j] = numero;
                System.out.println(matriz[i][j]);

            }
        }

        System.out.println(" " + matriz[0][0] + " " + matriz[0][1] + " " + matriz[0][2] + "\n" + " " + matriz[1][0] + " " + matriz[1][1] + " " + matriz[1][2] + "\n" + " " + matriz[2][0] + " " + matriz[2][1] + " " + matriz[2][2] + "\n");

    }
}
