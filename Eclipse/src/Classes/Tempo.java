/*
 * Class 13.10.2020
 * Exercício 1.12 - Tempo em segundos para hh:mm:ss
 * 
 */
package Classes;

import java.util.Scanner;

public class Tempo {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int Sec = 0;
		int H = 0;
		int M = 0;
		int S = 0;
		
		/* 1) Ler os dados*/
		System.out.println("Tempo em segundos: ");
		Sec = read.nextInt();
		
		/* 2) Calcular o tempo*/
		/*H = Sec / 3600;*/
		int Temp = Sec / 60;
		H = Temp / 60;
		M = Temp % 60;
		S = Sec % 60;
		
		/* 3)Mostrar os resultados*/
		System.out.println("Horas -> " + H + ":" + M + ":" + S);
		

	}

}
