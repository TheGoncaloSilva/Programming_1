/* Programação I - Teste treino
 * JAM, 12-nov-2020
 * Cálculo do nº e valor das raízes reais de um polinómio de 2º grau. Ax^2 + Bx + C = 0
 * num dado intervalo.
 */

package First_Test_Train;

import java.util.Scanner;

public class second_degree_zeros {

	public static void main(String[] args) {
		// variáveis
		 double a, b, c, xi, xf; // coeficientes do polinómio
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
		
		 // Determinação das raízes
		 RaizesPol2(a, b, c, xi, xf, pontos);
		
		 // Teste da função f no intervalo [0, 2PI]. Preenche array y com pontos
		
		 double x1 = 0, x2 = Math.PI * 2;
		 int np = 10;
		 double[] y = new double [np];
		 // chamada à função
		 f(y, x1, x2, np);
		 // ecreve função no ecrã
		 for (int k = 0; k < y.length; k++)System.out.printf("%5.2f ",y[k]);
		 }
		 // função para leitura de um valor real do teclado no intervalo [a, b]
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
		
		 // função para cálculo das raízes de um polinómio do 2 grau
		 // A função escreve no ecra as raizes encontradas
		 // SEM USAR FORMULA RESOLVENTE.
		 // As raizes são os valores de x que correspondem à mudança de sinal de y
		 public static void RaizesPol2(double a, double b, double c, double xi, double xf, int npontos) {
		 //HIDE
		 double r=0;
		 int nraizes = 0;
		 double x, y, y0, delta;
		
		 delta = (xf - xi)/(npontos -1);
		 x = xi;
		 y0 = a * x * x + b * x + c;
		 for (int i = 0; i < npontos; i++) {
			 x = x + delta;
			 y = a * x * x + b * x + c;
			 if ((y0 > 0 && y <= 0) || (y0 < 0 && y >= 0)) { // testa mudança de sinal
				 System.out.printf("Raiz %d = %f%n", nraizes+1,x);
				 nraizes = nraizes + 1;
			 }
			 y0 = y;
		 }
		 System.out.printf("Encontradas %d raizes%n",nraizes);
		 //EDIT
		 }
		
		 // função f
		 // deve devolver um array preenchido com n pontos da função y num dado intervalo [a, b]
		 // y = sin (x + PI/4)
		 // ....implemantar função f
		 //HIDE
		 public static void f(double[] r, double a, double b, int npontos){
			 double dx = (b-a)/(npontos-1);
			 for (int x = 0; x < npontos; x++ )r[x]= Math.sin( a + x * dx + Math.PI/4);
		 }
		 //EDIT
		
		 }