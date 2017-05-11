/**
 * 
 */
package curso.android.aula01.exercicios.exercicio04;

/**
 * @author Jefferson Thadeu
 *
 */
public class Empregado {

	private String nome;
	private String sobrenome;
	private Double salario_mensal;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the sobrenome
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * @param sobrenome
	 *            the sobrenome to set
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * @return the salario_mensal
	 */
	public Double getSalario_mensal() {
		return salario_mensal;
	}

	/**
	 * @param salario_mensal the salario_mensal to set
	 */
	public void setSalario_mensal(Double salario_mensal) {
		this.salario_mensal = salario_mensal;
	}

	/**
	 * 
	 */
	public Empregado(String nome, String sobrenome, Double salario_mensal) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario_mensal = salario_mensal;
		
		if (this.salario_mensal < 0.0)
			this.salario_mensal = 0.0;
	}

}
