
package First_Test_Train;

import java.util.Scanner;

public class Rever1_zeros {

	public static void main(String[] args) {		
		//pedir os valores dos coeficientes e intervalos
		
		double a, b, c, xi, xf;
		int npontos = 0;
		
		System.out.println("Coeficientes A, B, C: ");
		a = lerNumero("A: ", -1000, 1000);
		b = lerNumero("B: ", -1000, 1000);
		c = lerNumero("C: ", -1000, 1000);
		System.out.println("Intervalo e num de pontos");
		xi = lerNumero("xi: ", -1000, 1000);
		xf = lerNumero("xf: ", -1000, 1000);
		npontos = (int) lerNumero("Npontos: ", 1, 10000);
		
		// Calcular as raízes do polinómio
		raizes(a, b, c, xi, xf,npontos);
		
		double x1 = 0, x2 = Math.PI * 2;
		int np =10;
		double[] y = new double[np];
		
		f(y, x1, x2, np);
		
		for (int i = 0; i < y.length; i++) {
			System.out.printf("%5.2f ", y[i]);
		}
		System.out.println();
		maximos(a, b, c, xi, xf,npontos);
		

	}
	
	public static double lerNumero (String mensagem, double a, double b) {
		Scanner sc = new Scanner(System.in);
		double num = -2000;
		
		while(num < a || num > b) {
			System.out.print(mensagem);
			num = sc.nextDouble();
		}
		return num;
	}
	
	public static void raizes(double a, double b, double c, double xi, double xf, int npontos) {
		double delta = (xf - xi)/(npontos - 1);
		double x = xi, y = 0;
		double y0 = a * x * x + b * x + c;
		int nraizes = 1;
		for(int i = 0; i < npontos; i++) {
			x += delta;
			y = a * x * x + b * x + c;
			if(y0 < 0 && y >= 0 || y0 >= 0 && y < 0) {
				System.out.printf("Raíz %d = %f \n", nraizes++, x);
			}
			
			y0 = y;
		}
		System.out.printf("Encontradas %d raizes \n", (nraizes - 1));
		
	}
	
	public static void f(double[] y, double a, double b, int np) {
		double dx = (b - a) / (np - 1);
		for(int i = 0; i < np; i++) {
			y[i] = Math.sin(a + i * dx + Math.PI/4);
		}
	}
	
	public static void maximos(double a, double b, double c, double xi, double xf, int npontos) {
		double delta = (xf - xi)/(npontos - 1);
		double x = xi, dx = 0;
		double dx0 = 2 * a * x + b; //derivada da função original
		int nmax = 0, nmin = 0;
		for(int i = 0; i < npontos; i++) {
			x += delta;
			dx = 2 * a * x + b;
			if(dx0 > 0 && dx <= 0) {
				System.out.println("Máximo em: " + x);
				nmax++;
			}else if(dx0 <= 0 && dx > 0) {
				System.out.println("Mínimo em: " + x);
				nmin++;
			}
			dx0 = dx;
		}
		if(nmax == 0) {
			System.out.println("A função não tem máximos");
		}else if(nmin == 0) {
			System.out.println("A função não tem minimos");
		}
		
	}

}
