/*
 * Class 22.10.2020
 * Exerc�cio 1.20 - Verificar se os numeros entre v�rios intervalos se intersetam
 * 
 */
package Classes;

import java.util.Scanner;

public class Number_Interval {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int[] Inter1 = new int[2];
		int[] Inter2 = new int[2];
		
		// 1) Ler os dados
		System.out.println("Indique o primeiro valor do primeiro intervalo: ");
		Inter1[0] = Sc.nextInt();
		System.out.println("Indique o segundo valor do primeiro intervalo: ");
		Inter1[1] = Sc.nextInt();
		
		System.out.println("Indique o primeiro valor do segundo intervalo: ");
		Inter2[0] = Sc.nextInt();
		System.out.println("Indique o segundo valor do segundo intervalo: ");
		Inter2[1] = Sc.nextInt();
		
		// 2) Verificar as condi��es
		if(Inter1[1] >= Inter1[0] && Inter2[1] >= Inter2[0]) {
			
			
			// 2) Calcular a interse��o
			boolean Val1 = Inter1[0] <= Inter2 [1] && Inter1[0] >= Inter2[0] || Inter1[1] >= Inter2[0] && Inter1[0] <= Inter2[1];
		
			// 3) Imprimir resultados
			if (Val1) 
				System.out.println("Os intervalos intersetam-se");
			else 
				System.out.println("Os intervalos n�o se intersetam");
			
		}else 
			System.out.println("Lembre-se o n�mero final tem de ser sempre maior que o inicial");;
		
		
		
		
		
		
	
	
	}

}
