/*
 * Class 17.10.2020
 * Exerc�cio 1.15 - C�lcular a nota final de P1, tendo em conta o m�todo de avalia��o cont�nuo
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
		System.out.println("Introduza a nota do primeiro teste Pr�tico: ");
		TP1 = read.nextFloat();
		TP1 = (25 * (TP1 / 20)) * 2;
		
		System.out.println("Introduza a nota do segundo teste Pr�tico: ");
		TP2 = read.nextFloat();
		TP2 = (35 * (TP2 / 20)) * 2;
		
		System.out.println("Introduza a nota do primeiro teste Te�rico Pr�tico: ");
		TTP1 = read.nextFloat();
		TTP1 = (10 * (TTP1 / 20)) * 2;
		
		System.out.println("Introduza a nota do segundo teste Te�rico Pr�tico: ");
		TTP2 = read.nextFloat();
		TTP2 = (10 * (TTP2 /20)) * 2;	
		
		System.out.println("Introduza a nota do terceiro teste Te�rico Pr�tico: ");
		TTP3 = read.nextFloat();
		TTP3 = (10 * (TTP3 /20)) * 2;
		
		System.out.println("Introduza a nota das quest�es realizadas no e-learning: ");
		QTP = read.nextFloat();
		QTP = (10 * (QTP /20)) * 2;
		
		// 2) Somar os valores
		double Result = (TP1 + TP2 + TTP1 +TTP2 +TTP3 + QTP);
		
		// 3) Arredondar os valores
		int Rounded = (int) Math.round(Result);
		
		
		// 4) Mostrar os Resultados
		System.out.println("A m�dia to aluno em 200 valores: " + Result);
		System.out.println("A m�dia do aluno em 20 valores: " + (Result / 10));
		System.out.println("A m�dia do aluno arredondada para unidades: " + Rounded);
		
		
		
		
	}

}
