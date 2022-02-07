package capitulo04;

import java.util.Scanner;

public class TempoDeContribuicao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		double idade = sc.nextDouble();
		
		System.out.println("Digite o tempo de contribuição: ");
		double tempo_contribuicao = sc.nextDouble();
		
		if (idade >= 55 && tempo_contribuicao >= 25) {
			System.out.println("Parabéns! Voce já pode se aposentar!");
		} else {
			System.out.println("Voce ainda não preenche os requisitos minimos para se aposentar!");
		}

	}

}
