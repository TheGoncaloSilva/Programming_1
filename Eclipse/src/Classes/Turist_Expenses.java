/*
 * Class 17.10.2020
 * Exerc�cio 1.16 - C�lcular a despeas m�dia de um turista em portugal
 * 
 */
package Classes;

import java.util.Scanner;

public class Turist_Expenses {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double InicialExpenses = 0;
		double IncPer = 1.20;
		
		// 1) Pedir dados ao utilizador
		System.out.println("Introduza o valor gasto no primeiro dia: ");
		InicialExpenses = read.nextDouble();
		
		double I = InicialExpenses;
		double Sum = InicialExpenses;
		
		// 2) Calcular segundo dia
		I = (I * IncPer);
		Sum = Sum + I;
		
		// 3) Calcular terceiro dia
		I = (I * IncPer);
		Sum = Sum + I;
		
		// 4) Calcular quarto dia
		I = (I * IncPer);
		Sum = Sum + I;
		
		// 5) Calcular o valor m�dio
		Sum = (Sum / 4);
		
		// 6) Mostrar o valor ao utilizador
		System.out.println("O valor m�dia gasto pelo turista foi: " + Sum);
		
		
		
	}

}
