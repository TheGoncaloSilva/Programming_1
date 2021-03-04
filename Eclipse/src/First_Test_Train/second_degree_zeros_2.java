package First_Test_Train;

import java.util.Scanner;

public class second_degree_zeros_2 {

	public static void main(String[] args) {
		// vari�veis
		 double a, b, c, xi, xf; // coeficientes do polin�mio
		 int pontos;
		
		 // Ler coeficientes A; B; C e intervalo de x
		 System.out.println("Coeficientes A, B, C:");
		
		 a = lerNumero("A: ", -1000, 1000);
		 b = lerNumero("B: ", -1000, 1000);
		 c = lerNumero("C: ", -1000, 1000);
		 System.out.println("Intervalo e num de pontos:");
		 xi = lerNumero("xi: ", -1000, 1000);
		 xf = lerNumero("xf: ", -1000, 1000);
		 pontos = (int)lerNumero("NPontos: ", 1, 100000);
		
		 // Determina��o das ra�zes
		 RaizesPol2(a, b, c, xi, xf, pontos);
		
		 // Teste da fun��o f no intervalo [0, 2PI]. Preenche array y com pontos
		
		 double x1 = 0, x2 = Math.PI * 2;
		 int np = 10;
		 double[] y = new double [np];
		 // chamada � fun��o
		 f(y, x1, x2, np);
		 // ecreve fun��o no ecr�
		 for (int k = 0; k < y.length; k++)System.out.printf("%5.2f ",y[k]);
		 
		 System.out.println();
		 maxnmin(a, b, c, xi, xf, pontos);
		 }
		 // fun��o para leitura de um valor real do teclado no intervalo [a, b]
		 static double lerNumero(String mensagem, double a, double b) {
			 Scanner ler = new Scanner(System.in);
			 //HIDE
			 double n;
			 do {
				 System.out.print(mensagem);
				 n = ler.nextDouble();
			 } while (n < a || n > b);
			 return n;
			 //EDIT
		 }
		 public static void RaizesPol2(double a, double b, double c, double xi, double xf , int npontos) {
			double delta = (xf - xi)/(npontos - 1);
			double x = xi;
			double y0 = a * x * x + b * x + c;
			int nraizes = 1;
			for(int i = 0; i < npontos; i++) {
				x += delta;
				double y = a * x * x + b * x + c;
				if(y <= 0 && y0 > 0 || y0 <= 0 && y > 0) {
					System.out.printf("Raiz %d = %f \n", nraizes++, x);
				}
				y0 = y;
			}
			System.out.printf("Encontradas %d raizes \n", (nraizes - 1));

		 }
		 public static void maxnmin(double a, double b, double c, double xi, double xf, int npontos){
			 double delta = (xf - xi)/(npontos - 1);
			 double x = xi, dx = 0;
			 double dx0 = 2 * a * x + b;
			 for(int i = 0; i < npontos; i++) {
				 x += delta;
				 dx = 2 * a * x + b;
				 if(dx <= 0 && dx0 > 0) {
					 System.out.println("M�ximo encontrado: " + x);
				 }else if (dx > 0 && dx0 <= 0) {
					 System.out.println("M�nimo encontrado: " + x);
				 }
				 dx0 = dx;
			 }
		 }
		 
		 public static void f(double[] y, double x1, double x2, int np) {
			 double delta = (x2 - x1)/(np - 1);
			 for(int x = 0; x < np; x++) {
				 y[x] = Math.sin(x1 + x * delta + (Math.PI/4));
			 }
		 }

}
