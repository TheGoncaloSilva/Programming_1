/*
 * Class 20.10.2020
 * Exercício 1.19 - Escrever informações acerca de um nome introduzido, como o nº de caracteres, se começa por maiuscula, etc.
 * 
 */
package Classes;

import java.util.Scanner;

public class Info_Name {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		String FirstName;
		String LastName;
		String FullName;
		int CarLenght = 0;
		
		// 1) Ler os numeros introduzidos
		System.out.println("Introduza o Nome Próprio: ");
		FirstName = Sc.nextLine();
		System.out.println("Introduza o Apelido: ");
		LastName = Sc.nextLine();
		
		// 2) Descobrir o nome inteiro
		FullName = FirstName + " " + LastName;
		
		// 3) Descobrir iniciais
		String Inicials = FirstName.substring(0 , 1) + LastName.substring(0 , 1);
		
		// 4) Contar o número de letras
		int LetterNumber = FirstName.length() + LastName.length();
		
		// 5) Descobrir se o nome e apelido começam por maiúsculas
		String Value1 = FirstName.substring(0 , 1);
		String Value2 = LastName.substring(0 , 1);
		boolean Validation =  Value1 == Value1.toUpperCase() && Value2 == Value2.toUpperCase();
		
		// 6) Imprimir resultados
		System.out.println(FullName + " , " + Inicials.toUpperCase() + " , " + LetterNumber + " , " + Validation);
	}

}
