package capitulo08;

import java.util.Scanner;

public class PrimeiroMetodo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avan�ado"};
		
		
		System.out.println("Escolha dentre os cursos abaixo: ");
		
		for(int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "] " + cursos[i]);
		}
		System.out.println("O curso que voc� deseja � o: ");
		Integer posicaoCursoEscolhido = sc.nextInt();
		
		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		
		if(!posicaoValida) {
			//System.err.print("Posi��o inv�lida!");
			//System.exit(1);
			posicaoInvalida();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cart�o", "Boleto"};
		
		System.out.println("Escolha dentre as formas de pagamento abaixo: ");
		
		for(int i = 0; i < formasPagamento.length; i++) {
			System.out.println("[" + "]" + formasPagamento[i]);
		}
		
		System.out.println("Sua forma de pagamento escolhida �: ");
		Integer posicaoFormaPagamentoEscolhida = sc.nextInt();
		
		posicaoValida = posicaoFormaPagamentoEscolhida >=0 
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length;
		
		if(!posicaoValida) {
			//System.err.print("Posi��o inv�lida!");
			//System.exit(1);
			posicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("O curso escolhido foi " + cursoEscolhido + "e a forma de pagamento � " + formaPagamentoEscolhida);
		
		sc.close();
		
		
	}
	
	static void imprimirTraco() {
		System.out.println("---------------------------------------------------");
	}
	
	static void posicaoInvalida() {
		System.err.print("Posi��o inv�lida!");
		System.exit(1);
	}
	
}
