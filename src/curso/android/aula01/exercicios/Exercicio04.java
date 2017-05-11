package curso.android.aula01.exercicios;

import curso.android.aula01.exercicios.exercicio04.*;

public class Exercicio04 {

	public static Double salarioAnual(Empregado empregado)
	{
		return empregado.getSalario_mensal() * 12;
	}
	
	public static void aumentaSalario(Double percentual, Empregado empregado)
	{
		empregado.setSalario_mensal(empregado.getSalario_mensal() + (empregado.getSalario_mensal() * percentual / 100));		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado empregado1 = new Empregado("Jefferson Thadeu", "Santos da Costa", 2570.00);
		Empregado empregado2 = new Empregado("Elias", "Gomes da Costa", -1000.00);
		
		System.out.println("Nome|Sobrenome|Salário Mensal");
		System.out.println("-----------------------------");
		System.out.println(empregado1.getNome() + "|" + empregado1.getSobrenome() + "|" + empregado1.getSalario_mensal());
		System.out.println(empregado2.getNome() + "|" + empregado2.getSobrenome() + "|" + empregado2.getSalario_mensal());
		System.out.println("");
		
		empregado2.setSalario_mensal(7805.00);
		
		System.out.println("Nome|Sobrenome|Salário Mensal");
		System.out.println("-----------------------------");
		System.out.println(empregado1.getNome() + "|" + empregado1.getSobrenome() + "|" + empregado1.getSalario_mensal());
		System.out.println(empregado2.getNome() + "|" + empregado2.getSobrenome() + "|" + empregado2.getSalario_mensal());
		System.out.println("");
				
		System.out.println("Nome|Sobrenome|Salário Anual");
		System.out.println("----------------------------");
		System.out.println(empregado1.getNome() + "|" + empregado1.getSobrenome() + "|" + salarioAnual(empregado1));
		System.out.println(empregado2.getNome() + "|" + empregado2.getSobrenome() + "|" + salarioAnual(empregado2));
		System.out.println("");
		
		aumentaSalario(10.0, empregado1);
		aumentaSalario(10.0, empregado2);
		
		System.out.println("Nome|Sobrenome|Salário Anual + 10%");
		System.out.println("----------------------------------");
		System.out.println(empregado1.getNome() + "|" + empregado1.getSobrenome() + "|" + salarioAnual(empregado1));
		System.out.println(empregado2.getNome() + "|" + empregado2.getSobrenome() + "|" + salarioAnual(empregado2));
		System.out.println("");
	}

}
