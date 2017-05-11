package curso.android.aula01.exercicios;

import java.util.Random;

import curso.android.aula01.exercicios.exercicio05.*;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pessoa[] habitantes = new Pessoa[20000];
		Pessoa pessoa;
		
		Random rand = new Random();
		
		double total_salario = 0.0;
		double media_salario = 0.0;
		double maior_salario = 0.0;
		int total_filhos = 0;
		int media_filhos = 0;
		int total_mulheres = 0;
		int mulheres_salario_2000 = 0;
		double percentual_mulheres = 0.0;
		
				
		for (int i = 0; i < 20000; i++)
		{
			pessoa = new Pessoa();
			
			pessoa.setNome("Nome Pessoa " + (i + 1));
			pessoa.setSexo((i % 3) == 0 ? 'M' : 'F');
			pessoa.setIdade(rand.nextInt(100));
			pessoa.setFilhos(rand.nextInt(20));
			pessoa.setSalario(rand.nextDouble() * 10000.00);
			
			habitantes[i] = pessoa;
			
			total_salario += pessoa.getSalario();
			
			if (pessoa.getSalario() > maior_salario)
				maior_salario = pessoa.getSalario();
			
			total_filhos += pessoa.getFilhos();
			
			if (pessoa.getSexo() == 'F')
			{
				total_mulheres++;
				
				if (pessoa.getSalario() > 2000)
					mulheres_salario_2000++;
			}
		}

		media_salario = total_salario / 20000;
		media_filhos = total_filhos / 20000;
		
		percentual_mulheres = (mulheres_salario_2000 * 100 / total_mulheres);
				
		System.out.println("a) A média de salário da população é " + media_salario + ";");
		System.out.println("b) A média do número de filhos é " + media_filhos + ";");
		System.out.println("c) O maior sálario é " + maior_salario + ";");
		System.out.println("d) O percentual de mulheres com salário superior à R$ 2.000,00 é " + percentual_mulheres + ";");

	}

}
