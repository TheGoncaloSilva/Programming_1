/*
 * Class 15.12.2020
 * ExercÌcio 8.1 - Alterar e criar o programa TestaHora
 * 
 */
package Classes_08;

import java.util.Scanner;

public class TestaHora {

	public static void main(String[] args) {
		 Hora inicio;  // tem de definir o novo tipo Hora!
		 Hora fim;
		    
		 inicio = new Hora();
		 inicio.h = 9;
		 inicio.m = 23;
		 inicio.s = 5;
		    
		 System.out.print("ComeÁou ·s ");
		 printHora(inicio);  // crie esta fun√ß√£o!
		 System.out.println(".");
		 System.out.println("Quando termina?");
		 fim = lerHora();  // crie esta fun√ß√£o!
		 System.out.print("InÌcio: ");
		 printHora(inicio);
		 System.out.print(" Fim: ");
		 printHora(fim);
		 
	}
	public static Hora lerHora() {
		Scanner sc = new Scanner(System.in);
		Hora x = new Hora();
		x.h = -1;
		x.m = -1;
		x.s = -1;
		while(x.h < 0 || x.h >= 24) {
			System.out.print("horas? ");
			x.h = sc.nextInt();
		}
		while(x.m < 0 || x.m >= 60) {
			System.out.print("minutos? ");
			x.m = sc.nextInt();
		}
		while(x.s < 0 || x.s >= 60) {
			System.out.print("segundos? ");
			x.s = sc.nextInt();
		}
		
		return x;		
	}
	public static void printHora(Hora x) {
		System.out.printf("%d:%d:%d", x.h, x.m, x.s);
	}

		/**
		EXEMPLO do pretendido:
		$ java TestaHora
		Come√ßou √†s 09:23:05.
		Quando termina?
		horas? 11
		minutos? 72
		minutos? 7
		segundos? 2
		In√≠cio: 09:23:05 Fim: 11:07:02.
		**/

}
class Hora{
	int h, m , s;
	  
}
