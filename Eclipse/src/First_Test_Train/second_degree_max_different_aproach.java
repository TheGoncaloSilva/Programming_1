package First_Test_Train;

import java.util.Scanner;

public class second_degree_max_different_aproach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    double a, b, c, npontos, delta, xi, xf;
	    
	    System.out.println("Insira os coeficientes");
	    a = sc.nextDouble();
	    b = sc.nextDouble();
	    c = sc.nextDouble();
	    System.out.println("Insira o intervalo(inferior e depois superior):");
	    xi = sc.nextDouble();
	    xf = sc.nextDouble();
	    System.out.println("Insira o n�mero de pontos a verificar:");
	    npontos = sc.nextDouble();
	    delta = (xf-xi)/(npontos-1);
	    maxmins(a, b, c, delta, xi, xf);
	}
	/* fun��o que calcula m�ximos e m�nimos de um polin�mio, 
	 * num intervalo [xi,xf] em n pontos, com distancia d
	 */
    public static void maxmins(double a, double b, double c, double d, double xi, double xf) {
    	int j = 1; //identificador dos maximos
    	int k = 1; //identificador dos m�nimos
        double x = xi;
        double yderiv = 2*a*x+b; //y=a*x*x+b*x+c, derivada disto
        for (double i = xi + d; i<=xf; i += d) {
        	double yderiv1 = 2*a*i+b; //derivada do ponto a seguir ao anterior(yderiv)
        	if (yderiv>0 && yderiv1<0) { //Se houver troca de sinal da derivada 
        		System.out.printf("M�ximo %d: %f\n", j, i);
        		j++;
        		yderiv = yderiv1;
        	}
        	else if (yderiv<0 && yderiv1>0) { //""
        		System.out.printf("M�nimo %d: %f\n", k, i);
        		k++;
        		yderiv = yderiv1;
        	}
        	else yderiv = yderiv1;
        }
        if (j==1 && k==1) System.out.println("N�o existem extremos"); 
        else if(j==1 && k!=1) System.out.println("N�o existem m�ximos");
        else if (k==1 && j!=1) System.out.println("N�o existem m�nimos");
    }
}
