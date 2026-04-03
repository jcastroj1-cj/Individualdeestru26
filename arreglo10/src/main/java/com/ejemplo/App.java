package com.ejemplo;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] miArreglo = new int[10];
        Random random = new Random();

        // 1. Llenar con valores aleatorios (1 al 50)
        for (int i = 0; i < miArreglo.length; i++) {
            miArreglo[i] = random.nextInt(50) + 1;
        }

        // 2. Mostrar original (usando for-each)
        System.out.print("Original: ");
        for (int n : miArreglo) System.out.print(n + " ");
        System.out.println();

        // 3. Cambiar impares por cero (usando for clásico)
        for (int i = 0; i < miArreglo.length; i++) {
            if (miArreglo[i] % 2 != 0) {
                miArreglo[i] = 0;
            }
        }

        // 4. Mostrar resultado final (usando for-each)
        System.out.print("Modificado: ");
        for (int n : miArreglo) System.out.print(n + " ");
        System.out.println();
    }
}
