package capitulo08;

import java.util.Scanner;

public class RetornandoValores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		
		
		imprimir("Escolha dentre os cursos abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(cursos);
		
		
		Integer posicaoCursoEscolhido = receberNumeroInteiro("O curso que voce deseja é o: ",  sc);
		
		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos);
		
		
		if(!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto"};
		
		imprimir("Escolha dentre as formas de pagamento abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(formasPagamento);
		
		imprimirEContinuarNaMesmaLinha("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = sc.nextInt();
		
		posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);
		
		if(!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi " + cursoEscolhido + "e a forma de pagamento é " + formaPagamentoEscolhida);
		
		sc.close();
		
	}
	static Integer receberNumeroInteiro(String texto, Scanner scanner) {
		imprimirEContinuarNaMesmaLinha(texto);
		Integer numero = scanner.nextInt();
		return numero;
	}
	
	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}
	
	static void imprimirTraco() {
		imprimir("---------------------------------------------------");
	}
	
	static void encerrarProgramaPorCausaDaPosicaoInvalida() {
		System.err.print("Posição inválida!");
		System.exit(1);
	}
	
	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for(int i = 0; i < vetor.length; i++) {
			imprimir("[" + i + "] " + vetor[i]);
		}
	}
	

}
