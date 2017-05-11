package curso.android.aula01.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int novoduelo = 0;
		int duelo = 0;
		int gols_atletico = 0, gols_cruzeiro = 0;
		int atletico = 0, cruzeiro = 0, empate = 0;

		Scanner leitura = new Scanner(System.in);

		do {
			duelo++;

			System.out.print("Informe os gols do atlético na partida " + duelo + ": ");
			gols_atletico = leitura.nextInt();

			System.out.print("Informe os gols do cruzeiro na partida " + duelo + ": ");
			gols_cruzeiro = leitura.nextInt();

			if (gols_atletico > gols_cruzeiro) {
				System.out.println("O vencedor da partida " + duelo + " foi o ALTÉTICO!");
				atletico++;
			} else if (gols_atletico < gols_cruzeiro) {
				System.out.println("O vencedor da partida " + duelo + " foi o CRUZEIRO!");
				cruzeiro++;
			} else {
				System.out.println("Houve empate na partida " + duelo + "!");
				empate++;
			}
			
			System.out.println("Nova partida? (1.Sim 2.Não)");
			novoduelo = leitura.nextInt();

		} while (novoduelo == 1);

		System.out.println("a) A estatística foi realizada com os resultados de " + duelo + " partita(s)!");
		System.out.println("b) O atletico foi vitorioso em " + atletico + " partita(s)!");
		System.out.println("c) O cruzeiro foi vitorioso em " + cruzeiro + " partita(s)!");
		System.out.println("d) Houve empate em " + empate + " partita(s)!");

		if (atletico == cruzeiro)
			System.out.print("e) Não houve vencedor entre as " + duelo + " partita(s)!");
		else {
			System.out.print("e) O maior vencedor entre as " + duelo + " partita(s) foi o ");
			if (atletico > cruzeiro)
				System.out.println("ALTÉTICO!");
			else
				System.out.println("CRUZEIRO!");
		}

	}

}
