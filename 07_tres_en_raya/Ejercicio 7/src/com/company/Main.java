package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int jugador1 = 0, jugador2 = 1, turno = 0, fila = 0, columna = 0;
        boolean ganador = false;
        int turnoreal = 0;

        int[][] matriz = {
                {2, 2, 2},
                {2, 2, 2},
                {2, 2, 2}
        };


        do {

            System.out.print("Fila: ");
            fila = Integer.parseInt(br.readLine());
            System.out.print("Columna: ");
            columna = Integer.parseInt(br.readLine());

            if (matriz[fila][columna] == 2) {


                matriz[fila][columna] = turno;
                ganador = comprobarGanador(matriz, turno);
                visualizarTablero(matriz);
                turnoreal = turno;
                turnoreal++;

                turno++;
                if (turno == 2) {
                    turno = 0;
                }
            } else {
                System.out.println("Error, esta casilla ya esta utilizada");
            }

        } while (ganador == false);
        System.out.println("Fin");
        System.out.println("El ganador es el jugador " + turnoreal);

    }


    public static void visualizarTablero(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.format("%4d", matriz[i][j]);

            }
            System.out.println();
        }

    }

    public static boolean comprobarGanador(int[][] matriz, int turno) {

        boolean ganador = false;

        if (matriz[0][0] == turno && matriz[0][1] == turno && matriz[0][2] == turno) {
            ganador = true;
            System.out.println("Me ejecuto");
        }


        if (matriz[1][0] == turno && matriz[1][1] == turno && matriz[1][2] == turno) {
            ganador = true;
        }

        if (matriz[2][0] == turno && matriz[2][1] == turno && matriz[2][2] == turno) {
            ganador = true;
        }

        if (matriz[0][0] == turno && matriz[1][0] == turno && matriz[2][0] == turno) {
            ganador = true;
        }

        if (matriz[0][1] == turno && matriz[1][1] == turno && matriz[2][1] == turno) {
            ganador = true;
        }
        if (matriz[0][2] == turno && matriz[1][2] == turno && matriz[2][2] == turno) {
            ganador = true;
        }
        if (matriz[0][0] == turno && matriz[1][1] == turno && matriz[2][2] == turno) {
            ganador = true;
        }
        if (matriz[0][2] == turno && matriz[1][1] == turno && matriz[2][0] == turno) {
            ganador = true;
        }
        return ganador;

    }


}
