package curso.android.aula01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {		
		// Saída de Dados
		// Imprime texto na tela
		System.out.println("Bem vindo!\n");
		
		// Declaração de variáveis
		int num1;
		num1 = 18;
		
		// Imprime o valor da variável na tela
		System.out.println("O primeiro número é: " + num1);
		
		int num2;
		num2 = 20;
		
		System.out.println("O segundo número é: " + num2);
		
		// Entrada de Dados
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um número: ");
		
		int num = leitura.nextInt();
		num = num * 2;
		
		System.out.println("Resultado = " + num);		
		
	}
	
}
