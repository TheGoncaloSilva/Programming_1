/*
 * day 01.12.2020
 * Exerc�cio 2.7 - Descobrir o maior de tr�s n�meros
 * 
 */
package Decision;

import java.util.Scanner;

public class Bigger_three_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = 0, aux = 0;
		
		System.out.println("Introduza o primeiro n�mero");
		aux = sc.nextInt();
		number = Math.max(number, aux);
		System.out.println("Introduza o segundo n�mero");
		aux = sc.nextInt();
		number = Math.max(number, aux);
		System.out.println("Introduza o terceiro n�mero");
		aux = sc.nextInt();
		number = Math.max(number, aux);
		
		System.out.println("O maior n�mero introduzido foi: " +  number);

	}

}
