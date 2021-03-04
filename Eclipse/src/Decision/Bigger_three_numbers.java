/*
 * day 01.12.2020
 * Exercício 2.7 - Descobrir o maior de três números
 * 
 */
package Decision;

import java.util.Scanner;

public class Bigger_three_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = 0, aux = 0;
		
		System.out.println("Introduza o primeiro número");
		aux = sc.nextInt();
		number = Math.max(number, aux);
		System.out.println("Introduza o segundo número");
		aux = sc.nextInt();
		number = Math.max(number, aux);
		System.out.println("Introduza o terceiro número");
		aux = sc.nextInt();
		number = Math.max(number, aux);
		
		System.out.println("O maior número introduzido foi: " +  number);

	}

}
