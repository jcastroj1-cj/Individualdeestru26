package com.ejemplo;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] miArreglo = new int[10];
        Random random = new Random(); // esta linea es el generador de números

        // números aleatorios (ejemplo: del 1 al 100)
        for (int i = 0; i < miArreglo.length; i++) {
            miArreglo[i] = random.nextInt(100) + 1; 
        }

        // Imprimir el arreglo en pantalla.
        System.out.println("Contenido aleatorio del arreglo:");
        for (int valor : miArreglo) {
            System.out.print(valor + " ");
        }
    }
}