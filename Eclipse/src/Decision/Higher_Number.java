/*
 * Class 27.10.2020
 * Exerc�cio 2.2 - Descobrir o maior de dois n�meros reais
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
		System.out.println("Introduza o primeiro n�mero: ");
		Number1 = Sc.nextInt();
		System.out.println("Introduza o segundo n�mero: ");
		Number2 = Sc.nextInt();
		
		// 2) Mostrar o resultado
		if (Number1 == Number2) {
			System.out.println("Os n�meros s�o iguais");
		}else {
			System.out.println("O maior n�mero �: " + Math.max(Number1, Number2));
		}

	}

}
