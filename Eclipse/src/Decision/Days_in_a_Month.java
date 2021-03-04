/*
 * Class 27.10.2020
 * Exercício 2.4 - Calcular o número de dias num mês de acordo com o ano
 * 
 */
package Decision;

import java.util.Scanner;

public class Days_in_a_Month {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int month = 0;
		int year = 0;
		int days = 0;
		
		// 1) Introduzir os dados
		System.out.println("Introduza o mês: ");
		month = Sc.nextInt();
		System.out.println("Introduza o ano: ");
		year = Sc.nextInt();

		// 2) Descobrir se é ano bissexto
		boolean leap = year % 4 == 0;
		
		// 3) Calcular os dias de cada mês
		switch (month){
			case 1: days = 31;break;
			case 2: if(leap) {days = 29;}else{days = 28;}break;
			case 3: days = 31;break;
			case 4: days = 30;break;
			case 5: days = 31;break;
			case 6: days = 30;break;
			case 7: days = 31;break;
			case 8: days = 31;break;
			case 9: days = 30;break;
			case 10: days = 31;break;
			case 11: days = 30;break;
			case 12: days = 31;break;
			default: days = 0;break;
		}
		if(days != 0) {
			System.out.println("O mês " + month + " do ano " + year + " tem " + days + " dias");
		}else {
			System.out.println("Introduza um valor do mês válida (entre 1 e 12)");
		}
	}

}
