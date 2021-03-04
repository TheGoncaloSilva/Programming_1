/*
 * Class 13.10.2020
 * Exercício 1.11 - Convert Dolar to Euro value
 * 
 */
package Classes;

import java.util.Scanner;

public class Dolar_to_Euro {

	public static void main(String[] args) {
	Scanner read = new Scanner(System.in);
		
	double Dolar;
	double ExRate;
		
	/* 1) Ler os dados*/
	System.out.println("Quantia em dólares: ");
	Dolar = read.nextDouble();
	System.out.println("Taxa de Conversão: ");
	ExRate = read.nextDouble();
	
	/* 2) Calcular Euros*/
	double Euro = (Dolar*ExRate)/1;
	
	/* 2) Mostrar Valores*/
	System.out.println("O valor em Euros é: " + Euro);

	}

}
