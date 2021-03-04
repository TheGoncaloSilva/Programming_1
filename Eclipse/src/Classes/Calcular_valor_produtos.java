/*
 * Class 20.10.2020
 * Exercício 1.17 - Cálcular o valor total líquido de uma fatura
 * 
 */
package Classes;

import java.util.Scanner;

public class Calcular_valor_produtos {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double Price = 0;
		double Desc = 0;
		double Tax = 0;
		double FinalPrice = 0;
		
		// 1) Ler os dados
		System.out.println("Introduza o preço do produto sem Iva e Descontos: ");
		Price = read.nextDouble();
		System.out.println("Introduza o desconto do utilizador (em percentagem): ");
		Desc = read.nextInt();
		System.out.println("Introduza o valor do IVA (em percentagem): ");
		Tax = read.nextInt();
		
		// 2) Calcular o desconto do utilizador
		Desc = Desc * 0.10;
		Desc = Desc * 0.10;
		double ValueDesc = Price * Desc;
		ValueDesc = Price - ValueDesc;
		
		// 3) Calcular o IVA
		Tax = Tax * 0.10;
		Tax = Tax * 0.10;
		double ValueIva = ValueDesc * Tax;
		FinalPrice = ValueDesc + ValueIva;

		// 4) Mostrar o resultado
		System.out.println("O valor Liquido do produto com desconto e Iva é: " + FinalPrice);
		
		
	}

}
