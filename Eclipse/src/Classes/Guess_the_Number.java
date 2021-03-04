/*
 * Class 22.10.2020
 * Exercício 1.21 - Adivinhar um número
 * 
 */
package Classes;

import java.util.Random;
import java.util.Scanner;

public class Guess_the_Number {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int Number = 0;
		
		// 1) Pedir os dados
		System.out.println("Introduza o seu número: ");
		Number = Sc.nextInt();
		
		// 2) Gerar o random
		int Random = (int) (Math.random() * 20);
		
		// 3) Imprimir o resultado
		int Result = 0;
		if (Number > Random) {
			Result = Number - Random;
			System.out.println("O número gerado foi: " + Random + " , Você errou por: " + Result);
		}else if (Number < Random) {
			Result = Random - Number;
			System.out.println("O número gerado foi: " + Random + " , Você errou por: " + Result);
		}else
		System.out.println("O número gerado foi: " + Random + " , Parabéns, você acertou");

	}

}
