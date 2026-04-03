package com.ejemplo;

import java.util.Scanner;

public class ConversorBase {
    public static void main (String[] arg) {
	Scanner sc = new Scanner(System.in);
		
	System.out.print("Introduce un numero en base 10: ");
	int numero = sc.nextInt();
	

	System.out.println("Base 2 (binario): " + convertir(numero, 2));
	System.out.println("Base 8 (Octal): " + convertir(numero, 8));
	System.out.println("Base 2 (Hexadecimal): " + convertir(numero, 16));
 	
	
	sc.close();

	} 




   public static String convertir(int n, int base) {
	if (n == 0) return "0";
        
	char[] digitosHex = "0123456789ABCDEF".toCharArray();
	int[] residuos = new int [32];
	int i = 0;
	int temp = n;
  	
	while (temp > 0) {
	    residuos [i] = temp % base;
	    temp = temp / base;
	    i++;	
	}
	
	StringBuilder resultado = new  StringBuilder();
	for (int j = i - 1; j>= 0; j--) {
	     resultado.append(digitosHex[residuos[j]]);
	}
 
	return resultado.toString();
  }

}