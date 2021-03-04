/*
 * Class 17.10.2020
 * Exercício 1.15 - Cálcular a nota final de P1, tendo em conta o método de avaliação contínuo
 * 
 */
package Classes;

import java.util.Scanner;

public class Calc_Evaluation {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float TP1 = 0;
		float TP2 = 0;
		float TTP1 = 0;
		float TTP2 = 0;
		float TTP3 = 0;
		float QTP = 0;
		
		// 1) Introduzir os dados e calcular as percentagens de cada teste
		System.out.println("Introduza a nota do primeiro teste Prático: ");
		TP1 = read.nextFloat();
		TP1 = (25 * (TP1 / 20)) * 2;
		
		System.out.println("Introduza a nota do segundo teste Prático: ");
		TP2 = read.nextFloat();
		TP2 = (35 * (TP2 / 20)) * 2;
		
		System.out.println("Introduza a nota do primeiro teste Teórico Prático: ");
		TTP1 = read.nextFloat();
		TTP1 = (10 * (TTP1 / 20)) * 2;
		
		System.out.println("Introduza a nota do segundo teste Teórico Prático: ");
		TTP2 = read.nextFloat();
		TTP2 = (10 * (TTP2 /20)) * 2;	
		
		System.out.println("Introduza a nota do terceiro teste Teórico Prático: ");
		TTP3 = read.nextFloat();
		TTP3 = (10 * (TTP3 /20)) * 2;
		
		System.out.println("Introduza a nota das questões realizadas no e-learning: ");
		QTP = read.nextFloat();
		QTP = (10 * (QTP /20)) * 2;
		
		// 2) Somar os valores
		double Result = (TP1 + TP2 + TTP1 +TTP2 +TTP3 + QTP);
		
		// 3) Arredondar os valores
		int Rounded = (int) Math.round(Result);
		
		
		// 4) Mostrar os Resultados
		System.out.println("A média to aluno em 200 valores: " + Result);
		System.out.println("A média do aluno em 20 valores: " + (Result / 10));
		System.out.println("A média do aluno arredondada para unidades: " + Rounded);
		
		
		
		
	}

}
