package curso.android.aula01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {		
		// Sa�da de Dados
		// Imprime texto na tela
		System.out.println("Bem vindo!\n");
		
		// Declara��o de vari�veis
		int num1;
		num1 = 18;
		
		// Imprime o valor da vari�vel na tela
		System.out.println("O primeiro n�mero �: " + num1);
		
		int num2;
		num2 = 20;
		
		System.out.println("O segundo n�mero �: " + num2);
		
		// Entrada de Dados
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		
		int num = leitura.nextInt();
		num = num * 2;
		
		System.out.println("Resultado = " + num);		
		
	}
	
}
