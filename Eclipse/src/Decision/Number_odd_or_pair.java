/*
 * day 01.10.2020
 * Exerc�cio 2.6 - Saber se um n�mero � �mpar ou par
 * 
 */
package Decision;

import java.util.Scanner;

public class Number_odd_or_pair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduza o n�mero");
		int number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("O n�mero � par");
		}else {
			System.out.println("O n�mero � �mpar");
		}

	}

}
