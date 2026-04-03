package com.ejemplo;

public class MatrizApp {
    public static void main(String[] args) {
        // 1. Declaración e inicialización de una matriz 3x3
        int[][] matriz = new int[3][3];
        int valor = 1;

        // 2. Llenar la matriz con valores del 1 al 9
        for (int i = 0; i < 3; i++) {       // Recorre filas
            for (int j = 0; j < 3; j++) {   // Recorre columnas
                matriz[i][j] = valor++;
            }
        }

        // 3. Recorrer y mostrar la matriz (Formato tabla)
        System.out.println("--- Matriz 3x3 ---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t"); // \t para alinear columnas
            }
            System.out.println(); // Salto de línea por cada fila
        }
    }
}

