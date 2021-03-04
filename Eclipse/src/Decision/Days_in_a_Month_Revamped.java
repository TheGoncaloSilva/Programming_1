/*
 * Day 01.12.2020
 * Exercício 2.10 - calcular a data do dia seguinte e dia anterior
 * 
 */
package Decision;

import java.util.Scanner;

public class Days_in_a_Month_Revamped {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int month = 0;
		int year = 0;
		int day = 0;
		int days = 0;
		
		// 1) Introduzir os dados
		System.out.println("Introduza o dia do mês: ");
		day = Sc.nextInt();
		System.out.println("Introduza o mês: ");
		month = Sc.nextInt();
		System.out.println("Introduza o ano: ");
		year = Sc.nextInt();

		// 2) Descobrir se é ano bissexto
		boolean leap = year % 4 == 0;
		
		// 3) Calcular os dias de cada mês
		days = calcmonth(month, leap);
		
		if(days != 0) {
			if(day >= 1 || day <= days) {
				if(day == days) {
					if(month == 12) {
						System.out.printf("O dia seguinte é %d- %d-%d \n", 1, 1, (year + 1));
						System.out.printf("O dia anterior é %d- %d-%d \n", (day - 1), month , year);
					}else {
						System.out.printf("O dia seguinte é %d- %d-%d \n", 1, month + 1, year);
						System.out.printf("O dia anterior é %d- %d-%d \n", (day - 1), month , year);
					}
				}else if(day == 1) {
					if(month == 1) {
						System.out.printf("O dia seguinte é %d- %d-%d \n", (day + 1), month , year);
						System.out.printf("O dia anterior é %d- %d-%d \n", 31, 12 , (year - 1));
					}else {
						System.out.printf("O dia seguinte é %d- %d-%d \n", (day + 1), month , year);
						System.out.printf("O dia anterior é %d- %d-%d \n", calcmonth((month-1), leap), (month-1) , year);
					}
				}else {
					System.out.printf("O dia seguinte é %d- %d-%d \n", (day + 1), month , year);
					System.out.printf("O dia anterior é %d- %d-%d \n", (day - 1), month , year);
				}
			}else {
				System.out.println("Introduza um valor para o dia válido");
			}
		}else {
			System.out.println("Introduza um valor do mês válido (entre 1 e 12)");
		}

	}
	public static int calcmonth(int month, boolean leap) {
		int days;
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
		return days;
	}

}
