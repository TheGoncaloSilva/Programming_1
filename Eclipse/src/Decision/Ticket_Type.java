/*
 * Class 27.10.2020
 * Exercício 2.3 - Determinar o tipo de bilhete de cada visitante
 * 
 */
package Decision;

import java.util.Scanner;

public class Ticket_Type {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int Age = 0;
		
		// 1) Introduzir os valores
		System.out.println("Introduza a sua idade: ");
		Age = Sc.nextInt();
		
		// 2) Mostrar os resultados
		if(Age >= 0 && Age < 6) {
			System.out.println("Isento de pagamento");
		}else if(Age >= 6 && Age <= 12) {
			System.out.println("Bilhete de Criança");
		}else if(Age >= 13 && Age <= 65) {
			System.out.println("Bilhete Normal");
		}else if(Age > 65) {
			System.out.println("Bilhete de 3ª idade");
		}else {
			System.out.println("Idade Inválida");
		}
	}

}
