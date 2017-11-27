package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String nombre, ape1, ape2, fin;
        char letra, letra2;
        int comp = 0;
        System.out.print("¿Cuantos compañeros tienes?: ");
        comp = Integer.parseInt(br.readLine());

        String[] compañero = new String[comp];

        for (int i = 0; i < compañero.length; i++) {
            System.out.print("Escribe el nombre: ");
            nombre = br.readLine();
            System.out.print("Escribe el primer apellido: ");
            ape1 = br.readLine();
            System.out.print("Escribe el segundo apellido: ");
            ape2 = br.readLine();
            compañero[i] = nombre + " " + ape1 + " " + ape2;


        }

        System.out.println("Escribe una letra o fin: ");
        fin = br.readLine();
        if (!fin.equalsIgnoreCase("fin")) {
            letra = fin.charAt(0);


            for (int i = 0; i < compañero.length; i++) {
                letra2 = compañero[i].charAt(0);

                if (letra == letra2) {
                    System.out.println(compañero[i]);

                }
            }
        } else {
            System.out.println("fin");
        }

    }
}
