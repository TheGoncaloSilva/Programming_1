/*
 * Class 20.10.2020
 * Exercício 1.18 - Ler caracteres e atribuir como inteiros e vice-versa
 * 
 */
package Classes;

import java.util.Scanner;

public class Read_Chars_as_Numbers {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		char Car;
		
		// 1) ler os dados
		System.out.println("Introduza o caracter: ");
		Car = Sc.nextLine().charAt(0);
		
		// 2) Converter para maiúscula
		int CarNumber = (int) Car;
		CarNumber = CarNumber - 32;
		
		// 3) Mostrar resultado
		System.out.println("Maiúscula do caracter: " + (char) CarNumber);
	}

}
