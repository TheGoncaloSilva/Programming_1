/*
 * Class 14.01.2020
 * Exercício 8.2 - Distância entre dois pontos com classes
 * Exercício 11.2 - melhorar o exercício 8.2, acrescentando imprimir os pontos ordenados
 * 
 */
package ArraysClasse;

import java.util.Scanner;

public class Ex_08_revamped {

	public static void main(String[] args) {
		Ponto p = new Ponto();
		Ponto p0 = new Ponto();		
		p0.x = 0;
		p0.y = 0;
		Ponto pmax = new Ponto();		
		pmax.x = 0;
		pmax.y = 0;
		Ponto[] pontos = new Ponto[100];
		int count = 0;
		double dist = 0, max = 0;
		
		//System.out.println(Character.toUpperCase('a'));
		
		do {
			p = lerPonto();
			pontos[count] = new Ponto();
			double aux = distancia(p0, p);
			dist += aux;
			
			p.d = aux;
			pontos[count] = p;
			
			if(aux > max) {
				max = dist;
				pmax.x = p.x;
				pmax.y = p.y;
			}
			count++;
		}while(p.x != 0 || p.y != 0);
	
		escreverPonto(pontos, pmax, count, dist);

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
	
	public static void escreverPonto(Ponto[] pontos, Ponto p, int count, double dist) {
		System.out.printf("A soma das distâncias dos %d pontos à origem é %3.1f \n",(count - 1), dist);
		System.out.printf("O ponto mais afastado da origem foi: (%3.1f, %3.1f) \n", (double) p.x, (double) p.y);
		
		System.out.println("SelectSort");
		selectSort(pontos, count);
		
		System.out.println("BubbleSort");
		bubbleSort(pontos, count);
		
		
		
	}
	
	public static void bubbleSort(Ponto[] pontos, int n) {
		int nlo = 0; //número de valores da lista ordenada
		boolean trocas;
		
		do {
			trocas = false; // resetamos a variável
			for(int i = 0; i < n - 1 - nlo;i++) {
				if(pontos[i].d > pontos[i+1].d) {
					swap(pontos, i, i+1);
					/*
					 * tmp = seq[i];
					 * seq[i] = seq[i+1];
					 * seq[i+1] = tmp;
					 */
					trocas = true; // houve trocas
				}
			}
			nlo++; //aumenta lista de valores ordenados
		}while(trocas); // enquanto houver trocas repetimos
		
		/*
		 * 
		 * boolean troca;
        	int nord = 0; // nÃºmero de valores da lista ordenada
        	do {
	            troca = false;
	            for(int i = 0 ; i <= a.length - 2 - nord; i++) {
	                if(a[i] > a[i+1]) {
	                    swap(a, i, i+1);
	                    troca=true;
	                }
	            }
            	nord++;  // +1 valor ordenado, que fica no fim da lista
        	} while(troca);
		 */
		
		imprimir(pontos, n);
		
	}
	
	public static void selectSort(Ponto[] pontos, int n) {
		
		for(int l = 0; l < n-1; l++) { // fixamos a posição
			for(int c = l + 1; c < n; c++) { // percorremos as outras
				if(pontos[l].d > pontos[c].d) {// se mínimo, trocamos
					swap(pontos, l, c); 
					/*
					 * tmp = seq[l];
					 * seq[l] = seq[c];
					 * seq[c] = tmp;
					 */
				}
			}
		}
		imprimir(pontos, n);
	}
	
	public static void swap(Ponto[] pontos, int l, int c) {
		
		Ponto tmp = pontos[l];
		pontos[l] = pontos[c];
		pontos[c] = tmp;
		
	}
	
	public static void imprimir(Ponto[] pontos, int x) {
		
		for(int i = 0; i < x; i++) {
			System.out.println(pontos[i].x + ", " + pontos[i].y + " = " + pontos[i].d);
		}
		System.out.println();
	}
	

}
	class Ponto{
		int x, y;
		double d;
	}
