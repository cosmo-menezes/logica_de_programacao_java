package capitulo05;

public class EstruturaIf {

	public static void main(String[] args) {
		Double emprestimo = 4000.0;
		Double movimentacaoMedia = 2000.0;
		
		Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
		Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor &&
				aContaTemTempoSuficienteDeAbertura && temNomeLimpo;
		
		if(liberarEmprestimo) {
			System.out.println("Sim! Pode liberar empréstimo." );
		}else {
			System.out.println("O empréstimo não poderá ser liberado.");
		}

	}

}
