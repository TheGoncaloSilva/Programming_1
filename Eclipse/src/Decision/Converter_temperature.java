/*
 * day 01.12.2020
 * Exercício 2.9 - Conversor de Temperatura
 * 
 */
package Decision;

import java.util.Scanner;

public class Converter_temperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int aux = 0;
		char choice = 'c';
		
		while(aux == 0) {
			System.out.println("Tipo de Temperatura (c ou f)");
			choice = sc.next().charAt(0);
			if(choice == 'c') {
				aux++;
			}else if(choice == 'f') {
				aux++;
			}else {
				System.out.println("Por favor introduza um caractér correto");
			}
		}
		System.out.println("Introduza a Temperatura registada: ");
		double temp = sc.nextDouble();
		
		if(choice == 'c') {
			//converter para fahrenheit
			double resultado = (1.8 * temp + 32);
			System.out.println(temp + " ºCelsius é equivalente a " + resultado + " ºFahrenheit");
		}else{
			//converter para celsius
			double resultado =(temp - 32) / 1.8000;
			System.out.println(temp + " ºFahrenheit é equivalente a " + resultado + " ºCelsius");
		}
		

	}

}
