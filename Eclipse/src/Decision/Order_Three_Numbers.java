/*
 * day 01.12.2020
 * Exercício 2.8 - Ordenar três números
 * 
 */
package Decision;

import java.util.Arrays;
import java.util.Scanner;

public class Order_Three_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[3];
		System.out.println("Introduza o primeiro número");
		numbers[0] = sc.nextInt();
		System.out.println("Introduza o segundo número");
		numbers[1] = sc.nextInt();
		System.out.println("Introduza o terceiro número");
		numbers[2] = sc.nextInt();
		Arrays.sort(numbers);
		
		for(int i = 0; i < 3; i++) {
			if(i < 2) {
				System.out.print(numbers[i] + ", ");
			}else {
				System.out.print(numbers[i]);
			}
		}
		
	}
}
