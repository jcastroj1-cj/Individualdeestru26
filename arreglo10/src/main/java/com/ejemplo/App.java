package com.ejemplo;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int[] miArreglo = new int[10];
        Random random = new Random();

        // Llenado (usamos for clásico porque necesitamos el índice para asignar)
        for (int i = 0; i < miArreglo.length; i++) {
            miArreglo[i] = random.nextInt(50) + 1;
        }

        System.out.println("--- Recorrido usando FOR-EACH ---");
        
        // Recorrido con For-Each (Sintaxis: tipo elemento : arreglo)
        for (int numero : miArreglo) {
            System.out.println("Valor detectado: " + numero);
        }
    }
}
