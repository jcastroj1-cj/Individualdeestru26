package com.ejemplo;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] miArreglo = new int[10];
        Random random = new Random();

        // bucle for clásico
        for (int i = 0; i < miArreglo.length; i++) {
            miArreglo[i] = random.nextInt(100) + 1;
        }

        //Recorrido e impresión con bucle for clásico
        System.out.println("Contenido del arreglo (recorrido clásico):");
        for (int i = 0; i < miArreglo.length; i++) {
            System.out.println("Índice " + i + ": " + miArreglo[i]);
        }
    }
}