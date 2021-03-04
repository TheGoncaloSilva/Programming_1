/*
 * Class 27.10.2020
 * Exercício 2.2 - Descobrir o maior de dois números reais
 * 
 */
package Decision;

import java.util.Scanner;

public class Higher_Number {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int Number1 = 0;
		int Number2 = 0;
		
		// 1) Introduzir os valores
		System.out.println("Introduza o primeiro número: ");
		Number1 = Sc.nextInt();
		System.out.println("Introduza o segundo número: ");
		Number2 = Sc.nextInt();
		
		// 2) Mostrar o resultado
		if (Number1 == Number2) {
			System.out.println("Os números são iguais");
		}else {
			System.out.println("O maior número é: " + Math.max(Number1, Number2));
		}

	}

}
