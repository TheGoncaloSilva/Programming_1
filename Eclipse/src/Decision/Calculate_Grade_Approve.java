/*
 * Class 27.10.2020
 * Exercício 2.1 - Calcular a média de uma aluno na disciplina de programação 1 e indicar se foi Aprovado ou Reprovado
 * 
 */
package Decision;

import java.util.Scanner;

public class Calculate_Grade_Approve {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		
		int TPG1 = 0;
		int TPG2 = 0;
		int EI = 0;
		
		// 1) Ler os dados
		System.out.println("Introduza a nota da primeira avaliação:  ");
		TPG1 = SC.nextInt();
		TPG1 = (20 * (TPG1 / 20)) * 2;
		
		System.out.println("Introduza a nota da segunda avaliação: ");
		TPG2 = SC.nextInt();
		TPG2 = (30 * (TPG2 / 20)) * 2;
		
		System.out.println("Introduza a nota da terceira avaliação: ");
		EI = SC.nextInt();
		EI = (50 * (EI / 50)) * 2;
		
		// 2) Calcular a média
		int Grade = TPG1 + TPG2 + EI;
		
		// 3) Descobrir se passou
		if(Grade >= 9.5) {
			System.out.println("O aluno encontra-se Aprovado");
		}else {
			System.out.println("O aluno encontra-se Reprovado");
		}
		
	}

}
