/*
 * Class 15.12.2020
 * Exercício 8.2 - Distância entre dois pontos com classes
 * 
 */
package Classes_08;

import java.util.Scanner;

public class Distance_Between_Two_Points {

	public static void main(String[] args) {
		Ponto p = new Ponto();
		Ponto p0 = new Ponto();		
		p0.x = 0;
		p0.y = 0;
		Ponto pmax = new Ponto();		
		pmax.x = 0;
		pmax.y = 0;
		int count = (-1);
		double dist = 0, max = 0;
		
		
		do {
			p = lerPonto();
			count++;
			double aux = distancia(p0, p);
			dist += aux;
			
			if(aux > max) {
				max = dist;
				pmax.x = p.x;
				pmax.y = p.y;
			}
			
		}while(p.x != 0 || p.y != 0);
		
		System.out.printf("A soma das distâncias dos %d pontos à origem é %3.1f \n",count, dist);
		escreverPonto(pmax);

	}
	
	public static Ponto lerPonto() {
		Scanner sc = new Scanner(System.in);
		Ponto p = new Ponto();
		System.out.println("Introduza um ponto: ");
		System.out.print("Coordenada x: ");
		p.x = sc.nextInt();
		System.out.print("Coordenada y: ");
		p.y = sc.nextInt();
		return p;
	}
	public static double distancia(Ponto p1, Ponto p2) {
		double d = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
		if(d < 0) {
			d = d * (-1);
		}

		return d;
	}
	
	public static void escreverPonto(Ponto p) {
		System.out.printf("O ponto mais afastado da origem foi: (%3.1f, %3.1f) \n", (double) p.x, (double) p.y);
	}
	

}
	class Ponto{
		int x, y;
	}
