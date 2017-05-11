package curso.android.aula01.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Informe os comprimentos 'a', 'b' e 'c'...");

		double a, b, c, aux;

		// Entrada de Dados
		Scanner leitura = new Scanner(System.in);

		System.out.print("Informe o 1� valor: ");
		a = leitura.nextDouble();

		System.out.print("Informe o 2� valor: ");
		b = leitura.nextDouble();

		System.out.print("Informe o 3� valor: ");
		c = leitura.nextDouble();

		if (b > a) {
			aux = a;
			a = b;
			b = aux;
		}

		if (c > a) {
			aux = a;
			a = c;
			c = aux;
		}

		if (c > b) {
			aux = b;
			b = c;
			c = aux;
		}

		System.out.print("Os valores " + a + ", " + b + ", " + c + " ");

		if (a > (b + c))
			System.out.println("n�o forma tri�ngulo algum");
		else {
			if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2)))
				System.out.print("formam um tri�ngulo ret�ngulo");
			else if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2)))
				System.out.print("formam um tri�ngulo obtus�ngulo");
			else if (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2)))
				System.out.print("formam um tri�ngulo acut�ngulo");

			if (a == b && a == c)
				System.out.println(" equil�tero;");
			else if (a == b || b == c || a == c)
				System.out.println(" is�sceles.");
		}
	}

}
