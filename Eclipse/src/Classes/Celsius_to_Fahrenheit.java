/*
 * Class 13.10.2020
 * Exercício 1.10 - Convert Celsius to Fahrenheit
 * 
 */
package Classes;

import java.util.Scanner;

public class Celsius_to_Fahrenheit {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double Celsius;
		
		/* 1) Ler os dados*/
	    System.out.println("Temperatura em Celsius: ");
	    Celsius = read.nextDouble();
	    
	    /* 2) Calcular Fahrenheit*/
	    double F = 1.8*Celsius+32;
	    
	    /* 3) Mostrar Valor Resultado*/
	    System.out.println("Temperatura em Fahrenheit: " + F);
	    
	    read.close();

	}

}
