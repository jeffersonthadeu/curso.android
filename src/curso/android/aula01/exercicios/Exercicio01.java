package curso.android.aula01.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("C�lculo Equa��o 2� Grau.\n");
		
		System.out.println("Informe os valores 'a', 'b' e 'c'...");
		
		int a, b, c;
		
		// Entrada de Dados
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Valor 'a': ");
		a = leitura.nextInt();
		
		System.out.print("Valor 'b': ");
		b = leitura.nextInt();
		
		System.out.print("Valor 'c': ");
		c = leitura.nextInt();
		
		
		double delta = Math.pow(b, 2) - (4 * a * c);
					
		double x1 = (-b + Math.sqrt(delta)) / 2 * a;
		double x2 = (-b - Math.sqrt(delta)) / 2 * a;
		
		System.out.println("X1 � igual a: " + x1);
		System.out.println("X2 � igual a: " + x2);

	}

}

