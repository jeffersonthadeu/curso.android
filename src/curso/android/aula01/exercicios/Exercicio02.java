package curso.android.aula01.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Informe os comprimentos 'a', 'b' e 'c'...");

		double a, b, c, aux;

		// Entrada de Dados
		Scanner leitura = new Scanner(System.in);

		System.out.print("Informe o 1º valor: ");
		a = leitura.nextDouble();

		System.out.print("Informe o 2º valor: ");
		b = leitura.nextDouble();

		System.out.print("Informe o 3º valor: ");
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
			System.out.println("não forma triângulo algum");
		else {
			if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2)))
				System.out.print("formam um triângulo retângulo");
			else if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2)))
				System.out.print("formam um triângulo obtusângulo");
			else if (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2)))
				System.out.print("formam um triângulo acutângulo");

			if (a == b && a == c)
				System.out.println(" equilátero;");
			else if (a == b || b == c || a == c)
				System.out.println(" isósceles.");
		}
	}

}
